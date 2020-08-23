package com.mining.platform.organization.organization

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Organization entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "organization")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class OrganizationEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "name", nullable = false)
        var name: String

) : AuditableEntity()
