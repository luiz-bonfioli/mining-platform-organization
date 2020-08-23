package com.mining.platform.organization.team

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Team value object
 *
 * @author luiz.bonfioli
 */
data class Team(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<TeamEntity> {

    override var entity: TeamEntity
        get() = TeamEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
