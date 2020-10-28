package com.mining.platform.organization.planning.plan

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Plan repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface PlanRepository : AbstractRepository<PlanEntity, UUID> {

    fun findByDescriptionContains(description: String, pageable: Pageable): Page<PlanEntity>

}
