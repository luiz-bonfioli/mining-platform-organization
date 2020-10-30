package com.mining.platform.organization.planning.order

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.EntityConverter
import com.mining.platform.core.converter.ValueObjectConverter
import com.mining.platform.organization.checklist.item.ChecklistItem
import com.mining.platform.organization.planning.operation.Operation
import com.mining.platform.organization.planning.operation.OperationEntity
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
        var plan: Plan? = null,
        var operations: Collection<Operation>? = null
) : ValueObject<ProductionOrderEntity> {

    override var entity: ProductionOrderEntity
        get() = ProductionOrderEntity(id, description,
                plan?.let { EntityConverter.convert(it) },
                operations?.let { EntityConverter.convert(it) })
        set(entity) {
            id = entity.id
            description = entity.description
            plan = entity.plan?.let { ValueObjectConverter.convert(it, Plan::class) }
            //operations = entity.operations?.let { ValueObjectConverter.convert(it, Operation::class) }
        }
}
