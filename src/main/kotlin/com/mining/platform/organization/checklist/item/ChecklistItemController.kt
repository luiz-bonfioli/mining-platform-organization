package com.mining.platform.organization.checklist.item

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The ChecklistItem controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/checklist/checklist-item")
class ChecklistItemController : AbstractController<ChecklistItemEntity, ChecklistItem, ChecklistItemService>() {

    override val valueObjectClass: KClass<ChecklistItem>
        get() = ChecklistItem::class

}
