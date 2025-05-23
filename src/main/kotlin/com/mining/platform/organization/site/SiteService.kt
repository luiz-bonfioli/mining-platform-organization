package com.mining.platform.organization.site

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Site service
 *
 * @author luiz.bonfioli
 */
@Service
class SiteService : AbstractService<SiteEntity, SiteRepository>(), DataService<SiteEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<SiteEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)
}
