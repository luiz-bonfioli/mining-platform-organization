package com.mining.platform.organization.unit

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Unit repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface UnitRepository : AbstractRepository<UnitEntity, UUID>
