package com.mining.platform.organization.location

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Location repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface LocationRepository : AbstractRepository<LocationEntity, UUID>
