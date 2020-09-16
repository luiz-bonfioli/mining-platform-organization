package com.mining.platform.organization.equipment.state

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The State repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface StateRepository : AbstractRepository<StateEntity, UUID> {

    fun findByParentIdIsNullAndNameContains(name: String, pageable: Pageable): Page<StateEntity>

    fun findByParentIdAndNameContains(parentId: UUID, name: String, pageable: Pageable): Page<StateEntity>
}
