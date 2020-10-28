package com.mining.platform.organization.planning.plan

import com.mining.platform.core.controller.ValueObject
import java.util.*
import javax.persistence.Column
import javax.persistence.EnumType
import javax.persistence.Enumerated

/**
 * The Plan value object
 *
 * @author luiz.bonfioli
 */
data class Plan(
        var id: UUID? = null,
        var description: String = "",
        var startDate: Long? = null,
        var endDate: Long?= null,
        var planStatus: PlanStatus = PlanStatus.OPEN
) : ValueObject<PlanEntity> {

    override var entity: PlanEntity
        get() = PlanEntity(id, description, startDate, endDate, planStatus)
        set(entity) {
            id = entity.id
            description = entity.description
            startDate = entity.startDate
            endDate = entity.endDate
            planStatus = entity.planStatus
        }
}
