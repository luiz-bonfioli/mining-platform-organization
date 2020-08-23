package com.mining.platform.organization.material

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Material repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface MaterialRepository : AbstractRepository<MaterialEntity, UUID>
