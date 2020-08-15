package com.mining.platform.organization.unit

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Unit Controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/unit")
class UnitController : AbstractController<UnitEntity, Unit, UnitService>() {
    override val valueObjectClass: KClass<Unit>
        get() = Unit::class
}