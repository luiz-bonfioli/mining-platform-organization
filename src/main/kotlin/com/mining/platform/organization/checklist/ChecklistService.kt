package com.mining.platform.organization.checklist

import com.mining.platform.checklist.ChecklistPackageOuterClass.*
import com.mining.platform.core.communication.CommunicationService
import com.mining.platform.core.communication.protocol.Protocol
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.organization.checklist.item.ChecklistItemEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Checklist service
 *
 * @author luiz.bonfioli
 */
@Service
class ChecklistService : AbstractService<ChecklistEntity, ChecklistRepository>(), DataService<ChecklistEntity> {

    @Autowired
    private lateinit var communicationService: CommunicationService

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<ChecklistEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

    private fun onChecklistRequested() {
        val checklists = findAll().map { checklist ->
            ChecklistPackage.newBuilder().apply {
                id = checklist.id?.toString()
                name = checklist.name
                addAllChecklistItems(mapChecklistItems(checklist.checklistItems))
            }.build()
        }
        publishEquipmentList(ChecklistListPackage.newBuilder().addAllChecklists(checklists))
    }

    private fun mapChecklistItems(checklistItems: Collection<ChecklistItemEntity>?): List<ChecklistItemPackage>? =
            checklistItems?.map { checklistItem ->
                ChecklistItemPackage.newBuilder().apply {
                    id = checklistItem.id?.toString()
                    name = checklistItem.name
                }.build()
            }

    private fun publishEquipmentList(builder: ChecklistListPackage.Builder) =
            communicationService.publish(Protocol.Topic.MQTT_DEFAULT,
                    Protocol.Topic.DIAGNOSTIC + Protocol.Topic.RESPONSE,
                    Protocol.Service.EQUIPMENT,
                    Protocol.Event.EQUIPMENT_LIST,
                    builder.build().toByteArray()
            )
}

