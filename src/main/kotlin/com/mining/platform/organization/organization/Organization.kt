package com.mining.platform.organization.organization

import com.mining.platform.core.controller.EntityConverter.convert
import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.controller.ValueObjectConverter.convert
import com.mining.platform.organization.site.Site
import java.util.*

/**
 * The Organization Value Object
 *
 * @author luiz.bonfioli
 */
class Organization : ValueObject<OrganizationEntity> {
    var id: UUID? = null
    var name: String? = null
    var description: String? = null
    var sites: List<Site>? = null

    override var entity: OrganizationEntity
        get() {
            val entity = OrganizationEntity()
            entity.id = id
            entity.name = name
            entity.description = description
           // entity.sites = convert(sites)
            return entity
        }
        set(entity) {
            id = entity.id
            name = entity.name
            description = entity.description
//            if (isNotNullAndInitialized(entity.sites)) {
//                sites = convert(entity.sites, Site::class.java)
//            }
        }

    companion object {
        /**
         *
         */
        private const val serialVersionUID = 4683590789653946075L
    }
}