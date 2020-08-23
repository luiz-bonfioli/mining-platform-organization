package com.mining.platform.organization.checklist.entry

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The ChecklistEntry controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/checklist/checklist-entry")
class ChecklistEntryController : AbstractController<ChecklistEntryEntity, ChecklistEntry, ChecklistEntryService>() {

    override val valueObjectClass: KClass<ChecklistEntry>
        get() = ChecklistEntry::class

}
