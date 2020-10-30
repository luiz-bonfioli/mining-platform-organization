package com.mining.platform.organization.planning.operation

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Operation controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/operation")
class OperationController : AbstractController<OperationEntity, Operation, OperationService>() {

    override val valueObjectClass: KClass<Operation>
        get() = Operation::class

}
