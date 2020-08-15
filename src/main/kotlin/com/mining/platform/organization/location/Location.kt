package com.mining.platform.organization.location

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Location Value Object
 *
 * @author luiz.bonfioli
 */
class Location : ValueObject<LocationEntity> {
    var id: UUID? = null

    override var entity: LocationEntity
        get() {
            val entity = LocationEntity()
           // entity.id = id
            return entity
        }
        set(entity) {
          //  id = entity.id
        }

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = 8957392732365526930L
    }
}