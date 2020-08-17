package com.mining.platform.organization.equipment

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The equipment value object
 *
 * @author luiz.bonfioli
 */
data class Equipment(
        var id: UUID? = null,
        var name: String = "",
        var shortName: String = ""
) : ValueObject<EquipmentEntity> {

    override var entity: EquipmentEntity
        get() = EquipmentEntity(id, name, shortName)
        set(entity) {
            id = entity.id
            name = entity.name
            shortName = entity.shortName
        }

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = -6950296531675849882L
    }
}