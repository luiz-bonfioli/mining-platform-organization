package com.mining.platform.organization.site

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Site controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/site")
class SiteController : AbstractController<SiteEntity, Site, SiteService>() {

    override val valueObjectClass: KClass<Site>
        get() = Site::class

}
