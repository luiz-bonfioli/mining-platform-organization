package com.mining.platform.organization.checklist

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.EntityConverter
import com.mining.platform.core.converter.ValueObjectConverter
import com.mining.platform.organization.checklist.item.ChecklistItem
import java.util.*

/**
 * The Checklist value object
 *
 * @author luiz.bonfioli
 */
data class Checklist(
        var id: UUID? = null,
        var name: String = "",
        var checklistItems: Collection<ChecklistItem>? = null
) : ValueObject<ChecklistEntity> {

    override var entity: ChecklistEntity
        get() = ChecklistEntity(id, name, checklistItems?.let { EntityConverter.convert(it) })
        set(entity) {
            id = entity.id
            name = entity.name
            checklistItems = entity.checklistItems?.let { ValueObjectConverter.convert(it, ChecklistItem::class) }
        }
}
