package com.mining.platform.organization.team

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Team repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface TeamRepository : AbstractRepository<TeamEntity, UUID> {

    fun findByNameContains(name: String, pageable: Pageable): Page<TeamEntity>

}
