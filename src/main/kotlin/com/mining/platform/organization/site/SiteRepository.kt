package com.mining.platform.organization.site

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Site repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface SiteRepository : AbstractRepository<SiteEntity, UUID>
