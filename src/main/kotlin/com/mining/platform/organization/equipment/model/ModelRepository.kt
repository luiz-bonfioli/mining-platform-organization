package com.mining.platform.organization.equipment.model

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Model repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface ModelRepository : AbstractRepository<ModelEntity, UUID>
