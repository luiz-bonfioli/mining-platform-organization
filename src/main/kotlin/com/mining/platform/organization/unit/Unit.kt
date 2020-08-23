package com.mining.platform.organization.unit

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Unit value object
 *
 * @author luiz.bonfioli
 */
data class Unit(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<UnitEntity> {

    override var entity: UnitEntity
        get() = UnitEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
