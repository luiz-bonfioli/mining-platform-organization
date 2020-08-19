package com.mining.platform.organization.equipment

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

/**
 * The Equipment Service
 *
 * @author luiz.bonfioli
 */
@Service
class EquipmentService : AbstractService<EquipmentEntity, EquipmentRepository>(), DataService<EquipmentEntity> {

    fun findByCategoryId(categoryId: UUID): Collection<EquipmentEntity> = repository.findByCategoryId(categoryId)

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<EquipmentEntity> {
        return super.findAll(pageable)
    }
}