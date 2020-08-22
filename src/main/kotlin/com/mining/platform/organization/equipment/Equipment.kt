package com.mining.platform.organization.equipment

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.EntityConverter
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
                category?.let { EntityConverter.convert(it) },
                model?.let { EntityConverter.convert(it) })
        set(entity) {
            id = entity.id
            name = entity.name
            shortName = entity.shortName
            category = entity.category?.let { ValueObjectConverter.convert(it, Category::class) }
            model = entity.model?.let { ValueObjectConverter.convert(it, Model::class) }
        }
}