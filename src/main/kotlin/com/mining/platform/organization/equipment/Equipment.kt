package com.mining.platform.organization.equipment

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Equipment Value Object
 *
 * @author luiz.bonfioli
 */
class Equipment : ValueObject<EquipmentEntity> {
    var id: UUID? = null

    override var entity: EquipmentEntity
        get() {
            val entity = EquipmentEntity()
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
        private const val serialVersionUID = -6950296531675849882L
    }
}