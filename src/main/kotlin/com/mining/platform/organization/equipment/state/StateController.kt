package com.mining.platform.organization.equipment.state

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The State controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/state")
class StateController : AbstractController<StateEntity, State, StateService>() {

    override val valueObjectClass: KClass<State>
        get() = State::class

}
