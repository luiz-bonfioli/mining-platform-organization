package com.mining.platform.organization.team

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Team Value Object
 *
 * @author luiz.bonfioli
 */
class Team : ValueObject<TeamEntity> {
    var id: UUID? = null

    override var entity: TeamEntity
        get() {
            val entity = TeamEntity()
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
        private const val serialVersionUID = 2026120730754827914L
    }
}