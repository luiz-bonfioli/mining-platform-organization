package com.mining.platform.organization.material

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Material Value Object
 *
 * @author luiz.bonfioli
 */
class Material : ValueObject<MaterialEntity> {
    var id: UUID? = null

    override var entity: MaterialEntity
        get() {
            val entity = MaterialEntity()
            //entity.id = id
            return entity
        }
        set(entity) {
           // id = entity.id
        }

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = -3885405317270898384L
    }
}