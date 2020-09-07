package com.mining.platform.organization.equipment

import com.mining.platform.core.communication.MessageListener
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

/**
 * The Equipment service
 *
 * @author luiz.bonfioli
 */
@Service
class EquipmentService : AbstractService<EquipmentEntity, EquipmentRepository>(), DataService<EquipmentEntity>, MessageListener {

    fun findByCategoryId(categoryId: UUID): Collection<EquipmentEntity> = repository.findByCategoryId(categoryId)

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<EquipmentEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

    override fun onMessageArrived(eventId: Byte, payload: ByteArray, source: String) {
        TODO("Not yet implemented")
    }
}