package com.mining.platform.organization.checklist.item

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.checklist.ChecklistEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The ChecklistItem entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "checklist_item")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class ChecklistItemEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "name", nullable = false)
        var name: String,

        @ManyToOne
        @JoinColumn(name = "checklist_id", nullable = false, foreignKey = ForeignKey(name = "checklist_fk"))
        var checklist: ChecklistEntity

) : AuditableEntity()
