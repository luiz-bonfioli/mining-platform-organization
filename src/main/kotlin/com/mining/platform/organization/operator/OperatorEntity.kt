package com.mining.platform.organization.operator

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Operator entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "operator")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class OperatorEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "name", nullable = false)
        var name: String,

        @Column(name = "register", nullable = false)
        var register: Int

) : AuditableEntity()
