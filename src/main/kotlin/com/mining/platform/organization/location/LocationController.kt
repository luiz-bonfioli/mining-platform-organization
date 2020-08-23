package com.mining.platform.organization.location

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Location controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/location")
class LocationController : AbstractController<LocationEntity, Location, LocationService>() {

    override val valueObjectClass: KClass<Location>
        get() = Location::class

}
