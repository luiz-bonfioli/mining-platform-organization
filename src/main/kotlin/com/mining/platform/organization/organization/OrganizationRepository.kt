package com.mining.platform.organization.organization

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Organization repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface OrganizationRepository : AbstractRepository<OrganizationEntity, UUID> {

    fun findByNameContains(name: String, pageable: Pageable): Page<OrganizationEntity>

}
