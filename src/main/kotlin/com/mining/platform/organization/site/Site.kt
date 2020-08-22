package com.mining.platform.organization.site

import com.fasterxml.jackson.annotation.JsonProperty
import com.mining.platform.core.converter.EntityConverter.convert
import com.mining.platform.core.controller.ValueObject
import com.mining.platform.organization.organization.Organization
import java.util.*

/**
 * The Site Value Object
 *
 * @author luiz.bonfioli
 */
class Site : ValueObject<SiteEntity> {
    var id: UUID? = null
    var name: String? = null
    var description: String? = null

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private val organization: Organization? = null

    override var entity: SiteEntity
        get() {
            val entity = SiteEntity()
            entity.id = id
            entity.name = name
            entity.description = description
            entity.organization = organization?.let { convert(it) }
            return entity
        }
        set(entity) {
            id = entity.id
            name = entity.name
            description = entity.description
        }

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = -6976540052330905032L
    }
}