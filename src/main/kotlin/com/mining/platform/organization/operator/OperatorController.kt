package com.mining.platform.organization.operator

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Operator controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/operator")
class OperatorController : AbstractController<OperatorEntity, Operator, OperatorService>() {

    override val valueObjectClass: KClass<Operator>
        get() = Operator::class

}
