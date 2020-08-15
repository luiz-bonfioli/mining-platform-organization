package com.mining.platform.organization.unit

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Unit Entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "unit")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
class UnitEntity : AuditableEntity() {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true, nullable = false)
    override var id: UUID? = null

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = 2670031165756971879L
    }
}