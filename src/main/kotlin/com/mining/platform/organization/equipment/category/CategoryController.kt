package com.mining.platform.organization.equipment.category

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Category controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/equipment/category")
class CategoryController : AbstractController<CategoryEntity, Category, CategoryService>() {

    override val valueObjectClass: KClass<Category>
        get() = Category::class

}
