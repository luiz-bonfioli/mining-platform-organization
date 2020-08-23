package com.mining.platform.organization.organization

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Organization controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/organization")
class OrganizationController : AbstractController<OrganizationEntity, Organization, OrganizationService>() {

    override val valueObjectClass: KClass<Organization>
        get() = Organization::class

}
