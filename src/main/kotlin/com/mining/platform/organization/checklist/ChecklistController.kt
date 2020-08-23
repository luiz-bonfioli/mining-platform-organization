package com.mining.platform.organization.checklist

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Checklist controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/checklist")
class ChecklistController : AbstractController<ChecklistEntity, Checklist, ChecklistService>() {

    override val valueObjectClass: KClass<Checklist>
        get() = Checklist::class

}
