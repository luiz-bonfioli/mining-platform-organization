package com.mining.platform.organization.equipment

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Equipment Controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/equipment")
class EquipmentController : AbstractController<EquipmentEntity, Equipment, EquipmentService>() {
    override val valueObjectClass: KClass<Equipment>
        get() = Equipment::class
}