package com.mining.platform.organization.planning.operation

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.EntityConverter
import com.mining.platform.core.converter.ValueObjectConverter
import com.mining.platform.organization.planning.order.ProductionOrder
import java.util.*

/**
 * The Operation value object
 *
 * @author luiz.bonfioli
 */
data class Operation(
        var id: UUID? = null,
        var code: String = "",
        var productionOrder: ProductionOrder = ProductionOrder()
) : ValueObject<OperationEntity> {

    override var entity: OperationEntity
        get() = OperationEntity(id, code,
                productionOrder?.let { EntityConverter.convert(it) })
        set(entity) {
            id = entity.id
            code = entity.code
            productionOrder = entity.productionOrder?.let { ValueObjectConverter.convert(it, ProductionOrder::class) }
        }
}
