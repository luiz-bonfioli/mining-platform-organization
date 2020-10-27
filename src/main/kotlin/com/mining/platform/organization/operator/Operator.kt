package com.mining.platform.organization.operator

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.organization.team.TeamEntity
import java.util.*

/**
 * The Operator value object
 *
 * @author luiz.bonfioli
 */
data class Operator(
        var id: UUID? = null,
        var name: String = "",
        var register: String = ""
) : ValueObject<OperatorEntity> {

    override var entity: OperatorEntity
        get() = OperatorEntity(id, name, register)
        set(entity) {
            id = entity.id
            name = entity.name
            register = entity.register
        }
}
