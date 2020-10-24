package com.mining.platform.organization.location

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Location repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface LocationRepository : AbstractRepository<LocationEntity, UUID> {

    fun findByParentIdIsNullAndNameContains(name: String, pageable: Pageable): Page<LocationEntity>

    fun findByParentIdAndNameContains(parentId: UUID, name: String, pageable: Pageable): Page<LocationEntity>
}

