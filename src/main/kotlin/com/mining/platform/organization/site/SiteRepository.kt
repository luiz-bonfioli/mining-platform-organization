package com.mining.platform.organization.site

import com.mining.platform.core.datasource.AbstractRepository
import com.mining.platform.organization.organization.OrganizationEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Site repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface SiteRepository : AbstractRepository<SiteEntity, UUID>{

    fun findByNameContains(name: String, pageable: Pageable): Page<SiteEntity>

}
