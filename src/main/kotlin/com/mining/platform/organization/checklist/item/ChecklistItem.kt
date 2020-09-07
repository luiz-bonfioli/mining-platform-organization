package com.mining.platform.organization.checklist.item

import com.mining.platform.core.controller.ValueObject
import com.mining.platform.core.converter.EntityConverter
import com.mining.platform.core.converter.ValueObjectConverter
import com.mining.platform.organization.checklist.Checklist
import java.util.*

/**
 * The ChecklistItem value object
 *
 * @author luiz.bonfioli
 */
data class ChecklistItem(
        var id: UUID? = null,
        var name: String = "",
        var checklist: Checklist = Checklist()
) : ValueObject<ChecklistItemEntity> {

    override var entity: ChecklistItemEntity
        get() = ChecklistItemEntity(id, name, EntityConverter.convert(checklist))
        set(entity) {
            id = entity.id
            name = entity.name
          //  checklist = ValueObjectConverter.convert(entity.checklist, Checklist::class)
        }
}
