package com.mining.platform.organization.location

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Location value object
 *
 * @author luiz.bonfioli
 */
data class Location(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<LocationEntity> {

    override var entity: LocationEntity
        get() = LocationEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
