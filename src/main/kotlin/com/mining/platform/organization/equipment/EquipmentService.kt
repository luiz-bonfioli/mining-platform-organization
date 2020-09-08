package com.mining.platform.organization.equipment

import com.mining.platform.core.communication.CommunicationService
import com.mining.platform.core.communication.MessageListener
import com.mining.platform.core.communication.protocol.Protocol
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.equipment.EquipmentPackageOuterClass.EquipmentListPackage
import com.mining.platform.equipment.EquipmentPackageOuterClass.EquipmentPackage
import com.mining.platform.organization.device.DeviceEntity
import com.mining.platform.organization.device.DeviceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*
import java.util.logging.Level

/**
 * The Equipment service
 *
 * @author luiz.bonfioli
 */
@Service
class EquipmentService : AbstractService<EquipmentEntity, EquipmentRepository>(), DataService<EquipmentEntity>, MessageListener {

    @Autowired
    private lateinit var communicationService: CommunicationService

    @Autowired
    private lateinit var deviceService: DeviceService

    fun findByCategoryId(categoryId: UUID): Collection<EquipmentEntity> = repository.findByCategoryId(categoryId)

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<EquipmentEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

    override fun beforeSave(entity: EquipmentEntity) {
        super.beforeSave(entity)
        assignToDevice(entity)
    }

    override fun onMessageArrived(eventId: Byte, payload: ByteArray, source: String) {
        when (eventId) {
            Protocol.Event.EQUIPMENT_LIST -> onEquipmentListRequested()
            else -> logger.log(Level.SEVERE, "There isn't any implementation for event id: ${String.format("%02X", eventId)}")
        }
    }

    private fun assignToDevice(equipment: EquipmentEntity) {
        val device = DeviceEntity()
        equipment.device = deviceService.save(device)
    }

    private fun onEquipmentListRequested() {
        val equipments = findAll().map { equipment ->
            EquipmentPackage.newBuilder().apply {
                id = equipment.id?.toString()
                name = equipment.name
                shortName = equipment.shortName
                deviceId = equipment.device?.id.toString()
            }.build()
        }
        publishEquipmentList(EquipmentListPackage.newBuilder().addAllEquipments(equipments))
    }

    private fun publishEquipmentList(builder: EquipmentListPackage.Builder) {
        communicationService.publish(Protocol.Topic.MQTT_DEFAULT,
                Protocol.Topic.DIAGNOSTIC + Protocol.Topic.RESPONSE,
                Protocol.Service.EQUIPMENT,
                Protocol.Event.EQUIPMENT_LIST,
                builder.build().toByteArray()
        )
    }
}