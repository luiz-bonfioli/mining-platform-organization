package com.mining.platform.organization.material

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Material Controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/material")
class MaterialController : AbstractController<MaterialEntity, Material, MaterialService>() {
    override val valueObjectClass: KClass<Material>
        get() = Material::class
}