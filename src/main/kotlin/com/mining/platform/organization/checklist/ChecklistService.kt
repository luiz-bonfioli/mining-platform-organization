package com.mining.platform.organization.checklist

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.organization.site.SiteEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Checklist service
 *
 * @author luiz.bonfioli
 */
@Service
class ChecklistService : AbstractService<ChecklistEntity, ChecklistRepository>(), DataService<ChecklistEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<ChecklistEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)
}

