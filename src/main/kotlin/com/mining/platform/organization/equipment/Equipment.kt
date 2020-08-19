package com.mining.platform.organization.equipment

import com.mining.platform.core.controller.EntityConverter
import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.controller.ValueObjectConverter
import com.mining.platform.organization.equipment.category.Category
import com.mining.platform.organization.equipment.category.CategoryEntity
import java.util.*

/**
 * The equipment value object
 *
 * @author luiz.bonfioli
 */
data class Equipment(
        var id: UUID? = null,
        var name: String = "",
        var shortName: String = "",
        var category: Category? = null
) : ValueObject<EquipmentEntity> {

    override var entity: EquipmentEntity
        get() = EquipmentEntity(id, name, shortName, EntityConverter.convert(category))
        set(entity) {
            id = entity.id
            name = entity.name
            shortName = entity.shortName
            category = ValueObjectConverter.convert(entity.category, Category::class)
        }
}