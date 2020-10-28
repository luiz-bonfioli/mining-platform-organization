package com.mining.platform.organization.planning.plan

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Plan controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/plan")
class PlanController : AbstractController<PlanEntity, Plan, PlanService>() {

    override val valueObjectClass: KClass<Plan>
        get() = Plan::class

}
