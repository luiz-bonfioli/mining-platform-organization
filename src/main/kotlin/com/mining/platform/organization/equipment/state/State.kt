package com.mining.platform.organization.equipment.state

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.EntityConverter
import com.mining.platform.core.converter.ValueObjectConverter
import java.util.*

/**
 * The State value object
 *
 * @author luiz.bonfioli
 */
data class State(
        var id: UUID? = null,
        var name: String = "",
        var icon: String = "",
        var parent: State? = null
) : ValueObject<StateEntity> {

    override var entity: StateEntity
        get() = StateEntity(id, name, icon,
                parent?.let { EntityConverter.convert(it) })
        set(entity) {
            id = entity.id
            name = entity.name
            icon = entity.icon
            parent = entity.parent?.let { ValueObjectConverter.convert(it, State::class) }
        }
}
