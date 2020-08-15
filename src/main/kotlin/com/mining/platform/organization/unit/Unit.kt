package com.mining.platform.organization.unit

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Unit Value Object
 *
 * @author luiz.bonfioli
 */
class Unit : ValueObject<UnitEntity> {
    var id: UUID? = null

    override var entity: UnitEntity
        get() {
            val entity = UnitEntity()
            entity.id = id
            return entity
        }
        set(entity) {
            id = entity.id
        }

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = 7474067640985024047L
    }
}