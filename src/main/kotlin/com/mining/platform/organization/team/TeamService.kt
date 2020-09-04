package com.mining.platform.organization.team

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Team service
 *
 * @author luiz.bonfioli
 */
@Service
class TeamService : AbstractService<TeamEntity, TeamRepository>(), DataService<TeamEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<TeamEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

}
