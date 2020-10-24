package com.mining.platform.organization.location

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.equipment.state.StateEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Location entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "location")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class LocationEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "name", nullable = false)
        var name: String,

        @ManyToOne
        @JoinColumn(name = "parent_id", foreignKey = ForeignKey(name = "parent_fk"))
        var parent: LocationEntity? = null

) : AuditableEntity()
