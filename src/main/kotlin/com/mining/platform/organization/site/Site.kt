package com.mining.platform.organization.site

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Site value object
 *
 * @author luiz.bonfioli
 */
data class Site(
        var id: UUID? = null,
        var name: String = ""
) : ValueObject<SiteEntity> {

    override var entity: SiteEntity
        get() = SiteEntity(id, name)
        set(entity) {
            id = entity.id
            name = entity.name
        }
}
