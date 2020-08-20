package com.mining.platform.organization.equipment.model

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Model entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "model")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class ModelEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "name", nullable = false)
        var name: String

) : AuditableEntity()
