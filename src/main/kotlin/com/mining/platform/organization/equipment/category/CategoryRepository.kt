package com.mining.platform.organization.equipment.category

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Category repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface CategoryRepository : AbstractRepository<CategoryEntity, UUID>
