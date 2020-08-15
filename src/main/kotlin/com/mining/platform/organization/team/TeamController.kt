package com.mining.platform.organization.team

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Team Controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/team") //@Api(value = "team", tags = {"Team"})
class TeamController : AbstractController<TeamEntity, Team, TeamService>() {
    override val valueObjectClass: KClass<Team>
        get() = Team::class
}