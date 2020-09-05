package com.mining.platform.organization.company

import com.mining.platform.core.datasource.AbstractRepository
import com.mining.platform.organization.equipment.EquipmentEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Company repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface CompanyRepository : AbstractRepository<CompanyEntity, UUID> {

    fun findByNameContains(name: String, pageable: Pageable): Page<CompanyEntity>

}
