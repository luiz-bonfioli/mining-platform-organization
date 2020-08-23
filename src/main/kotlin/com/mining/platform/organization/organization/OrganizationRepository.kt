package com.mining.platform.organization.organization

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Organization repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface OrganizationRepository : AbstractRepository<OrganizationEntity, UUID>
