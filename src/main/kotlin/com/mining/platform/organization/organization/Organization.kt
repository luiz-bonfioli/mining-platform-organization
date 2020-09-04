package com.mining.platform.organization.organization

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Organization value object
 *
 * @author luiz.bonfioli
 */
data class Organization(
        var id: UUID? = null,
        var name: String = "",
        var description: String = ""
) : ValueObject<OrganizationEntity> {

    override var entity: OrganizationEntity
        get() = OrganizationEntity(id, name, description)
        set(entity) {
            id = entity.id
            name = entity.name
            description = entity.description
        }
}
