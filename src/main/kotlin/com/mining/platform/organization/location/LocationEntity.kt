package com.mining.platform.organization.location

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Location Entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "location")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
class LocationEntity : AuditableEntity() {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true, nullable = false)
    override var id: UUID? = null

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = 504213168092L
    }
}