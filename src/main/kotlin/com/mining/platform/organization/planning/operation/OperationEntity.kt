package com.mining.platform.organization.planning.operation

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.planning.order.ProductionOrderEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Operation entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "operation")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class OperationEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "code", nullable = false)
        var code: String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "production_order_id", nullable = false, foreignKey = ForeignKey(name = "production_order_fk"))
        var productionOrder: ProductionOrderEntity

) : AuditableEntity()
