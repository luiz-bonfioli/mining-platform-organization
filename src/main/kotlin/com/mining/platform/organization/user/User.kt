package com.mining.platform.organization.user

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The User value object
 *
 * @author luiz.bonfioli
 */
data class User(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<UserEntity> {

    override var entity: UserEntity
        get() = UserEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
