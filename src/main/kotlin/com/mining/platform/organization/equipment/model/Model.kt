package com.mining.platform.organization.equipment.model

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Model value object
 *
 * @author luiz.bonfioli
 */
data class Model(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<ModelEntity> {

    override var entity: ModelEntity
        get() = ModelEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
