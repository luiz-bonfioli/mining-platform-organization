package com.mining.platform.organization.equipment.category

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Category repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface CategoryRepository : AbstractRepository<CategoryEntity, UUID> {

    fun findByNameContains(name: String, pageable: Pageable): Page<CategoryEntity>

}
