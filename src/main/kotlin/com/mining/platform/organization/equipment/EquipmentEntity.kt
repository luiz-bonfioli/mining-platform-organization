package com.mining.platform.organization.equipment

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
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
class EquipmentEntity : AuditableEntity() {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true, nullable = false)
    override var id: UUID? = null

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = -4583580146827465507L
    }
}