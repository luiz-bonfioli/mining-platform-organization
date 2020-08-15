package com.mining.platform.organization.team

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Team Service
 *
 * @author luiz.bonfioli
 */
@Service
class TeamService : AbstractService<TeamEntity, TeamRepository>(), DataService<TeamEntity>