package com.mining.platform.organization.company

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Company value object
 *
 * @author luiz.bonfioli
 */
data class Company(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<CompanyEntity> {

    override var entity: CompanyEntity
        get() = CompanyEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
