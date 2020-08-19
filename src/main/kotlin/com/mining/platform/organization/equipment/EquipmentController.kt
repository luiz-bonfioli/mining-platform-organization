package com.mining.platform.organization.equipment

import com.mining.platform.core.controller.AbstractController
import com.mining.platform.core.controller.ServerResponse
import com.mining.platform.core.controller.ValueObjectConverter
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import kotlin.reflect.KClass

/**
 * The Equipment Controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/equipment")
class EquipmentController : AbstractController<EquipmentEntity, Equipment, EquipmentService>() {

    @GetMapping("/find-by-category-id/{categoryId}")
    fun findByCategoryId(@PathVariable categoryId: UUID): ResponseEntity<Collection<Equipment>> {
        val equipments = service.findByCategoryId(categoryId)
        return ServerResponse.success(ValueObjectConverter.convert(equipments, Equipment::class))
    }

    override val valueObjectClass: KClass<Equipment>
        get() = Equipment::class
}