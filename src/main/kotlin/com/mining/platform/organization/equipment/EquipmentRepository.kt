package com.mining.platform.organization.equipment

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Equipment Repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface EquipmentRepository : AbstractRepository<EquipmentEntity, UUID> {

    fun findByCategoryId(categoryId: UUID): Collection<EquipmentEntity>

    fun findByNameContains(name: String, pageable: Pageable): Page<EquipmentEntity>

}