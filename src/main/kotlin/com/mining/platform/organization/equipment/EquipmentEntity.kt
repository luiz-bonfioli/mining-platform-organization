package com.mining.platform.organization.equipment

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.equipment.category.CategoryEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Equipment Entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "equipment")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class EquipmentEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "name", nullable = false)
        var name: String,

        @Column(name = "short_name", nullable = false)
        var shortName: String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "category_id", nullable = false, foreignKey = ForeignKey(name = "category_fk"))
        var category: CategoryEntity?

) : AuditableEntity()