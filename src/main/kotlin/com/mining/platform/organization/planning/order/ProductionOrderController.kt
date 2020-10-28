package com.mining.platform.organization.planning.order

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The ProductionOrder controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/production-order")
class ProductionOrderController : AbstractController<ProductionOrderEntity, ProductionOrder, ProductionOrderService>() {

    override val valueObjectClass: KClass<ProductionOrder>
        get() = ProductionOrder::class

}
