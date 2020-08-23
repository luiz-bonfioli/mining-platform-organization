package com.mining.platform.organization.checklist.entry

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The ChecklistEntry value object
 *
 * @author luiz.bonfioli
 */
data class ChecklistEntry(
        var id: UUID? = null
) : ValueObject<ChecklistEntryEntity> {

    override var entity: ChecklistEntryEntity
        get() = ChecklistEntryEntity(id)
        set(entity) {
            id = entity.id
        }
}
