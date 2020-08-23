package com.mining.platform.organization.material

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Material value object
 *
 * @author luiz.bonfioli
 */
data class Material(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<MaterialEntity> {

    override var entity: MaterialEntity
        get() = MaterialEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
