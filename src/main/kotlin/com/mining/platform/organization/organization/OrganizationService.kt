package com.mining.platform.organization.organization

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Organization service
 *
 * @author luiz.bonfioli
 */
@Service
class OrganizationService : AbstractService<OrganizationEntity, OrganizationRepository>(), DataService<OrganizationEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<OrganizationEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)
}
