package com.mining.platform.organization.organization

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Organization Service
 *
 * @author luiz.bonfioli
 */
@Service
class OrganizationService : AbstractService<OrganizationEntity, OrganizationRepository>(), DataService<OrganizationEntity>