package com.mining.platform.organization.material

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Material repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface MaterialRepository : AbstractRepository<MaterialEntity, UUID> {

    fun findByNameContains(name: String, pageable: Pageable): Page<MaterialEntity>

}
