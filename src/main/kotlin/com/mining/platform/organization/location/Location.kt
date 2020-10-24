package com.mining.platform.organization.location

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.ValueObjectConverter
import java.util.*

/**
 * The Location value object
 *
 * @author luiz.bonfioli
 */
data class Location(
        var id: UUID? = null,
        var name: String = "",
        var parent: Location? = null

) : ValueObject<LocationEntity> {

    override var entity: LocationEntity
        get() = LocationEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
            parent = entity.parent?.let { ValueObjectConverter.convert(it, Location::class) }
        }
}
