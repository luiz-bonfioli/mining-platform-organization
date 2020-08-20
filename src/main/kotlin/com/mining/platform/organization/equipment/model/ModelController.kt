package com.mining.platform.organization.equipment.model

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Model controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/equipment/model")
class ModelController : AbstractController<ModelEntity, Model, ModelService>() {

    override val valueObjectClass: KClass<Model>
        get() = Model::class

}
