package com.mining.platform.organization.planning.plan

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.organization.equipment.EquipmentEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Plan service
 *
 * @author luiz.bonfioli
 */
@Service
class PlanService : AbstractService<PlanEntity, PlanRepository>(), DataService<PlanEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<PlanEntity> =
            repository.findByDescriptionContains(search.getOrDefault("description", ""), pageable)
}
