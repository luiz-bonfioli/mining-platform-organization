package com.mining.platform.organization.equipment

import com.mining.platform.core.converter.EntityConverter
import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.ValueObjectConverter
import com.mining.platform.organization.equipment.category.Category
import com.mining.platform.organization.equipment.model.Model
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
        var category: Category? = null,
        var model: Model? = null
) : ValueObject<EquipmentEntity> {

    override var entity: EquipmentEntity
        get() = EquipmentEntity(id, name, shortName,
                EntityConverter.convert(category),
                EntityConverter.convert(model))
        set(entity) {
            id = entity.id
            name = entity.name
            shortName = entity.shortName
            category = ValueObjectConverter.convert(entity.category, Category::class)
            model = ValueObjectConverter.convert(entity.model, Model::class)
        }
}