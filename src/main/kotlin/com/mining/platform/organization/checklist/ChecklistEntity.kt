package com.mining.platform.organization.checklist

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.checklist.item.ChecklistItemEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Checklist entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "checklist")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class ChecklistEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "name", nullable = false)
        var name: String,

        @OneToMany(mappedBy = "checklist", fetch = FetchType.LAZY)
        var checklistItems: Collection<ChecklistItemEntity>?

) : AuditableEntity()
