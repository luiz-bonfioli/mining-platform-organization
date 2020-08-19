package com.mining.platform.organization.equipment.category

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Category value object
 *
 * @author luiz.bonfioli
 */
data class Category(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<CategoryEntity> {

    override var entity: CategoryEntity
        get() = CategoryEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
