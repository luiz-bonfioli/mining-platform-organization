package com.mining.platform.organization.planning.order

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.planning.plan.PlanEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The ProductionOrder entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "production_order")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class ProductionOrderEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "description", nullable = false)
        var description: String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "plan_id", foreignKey = ForeignKey(name = "plan_fk"))
        var plan: PlanEntity?

) : AuditableEntity()
