package com.mining.platform.organization.planning.plan

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Plan entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "plan")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
data class PlanEntity(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id", unique = true, nullable = false)
        override var id: UUID? = null,

        @Column(name = "description", nullable = false)
        var description: String,

        @Column(name = "start_date")
        var startDate: Long?,

        @Column(name = "end_date")
        var endDate: Long?,

        @Enumerated(EnumType.STRING)
        @Column(name = "plan_status")
        var planStatus: PlanStatus

) : AuditableEntity()
