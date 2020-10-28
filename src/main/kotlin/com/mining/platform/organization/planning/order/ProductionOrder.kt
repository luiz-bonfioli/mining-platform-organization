package com.mining.platform.organization.planning.order

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.EntityConverter
import com.mining.platform.core.converter.ValueObjectConverter
import com.mining.platform.organization.planning.plan.Plan
import java.util.*

/**
 * The ProductionOrder value object
 *
 * @author luiz.bonfioli
 */
data class ProductionOrder(
        var id: UUID? = null,
        var description: String = "",
        var plan: Plan? = null
) : ValueObject<ProductionOrderEntity> {

    override var entity: ProductionOrderEntity
        get() = ProductionOrderEntity(id, description,
                plan?.let { EntityConverter.convert(it) })
        set(entity) {
            id = entity.id
            description = entity.description
            plan = entity.plan?.let { ValueObjectConverter.convert(it, Plan::class) }
        }
}
