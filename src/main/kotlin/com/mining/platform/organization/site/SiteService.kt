package com.mining.platform.organization.site

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Site Service
 *
 * @author luiz.bonfioli
 */
@Service
class SiteService : AbstractService<SiteEntity, SiteRepository>(), DataService<SiteEntity>