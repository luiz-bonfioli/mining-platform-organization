package com.mining.platform.organization.unit

import com.mining.platform.core.datasource.AbstractRepository
import com.mining.platform.organization.material.MaterialEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Unit repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface UnitRepository : AbstractRepository<UnitEntity, UUID>{

    fun findByNameContains(name: String, pageable: Pageable): Page<UnitEntity>

}
