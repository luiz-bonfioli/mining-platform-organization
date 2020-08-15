package com.mining.platform.organization.site

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.organization.OrganizationEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Site Entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "site")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
class SiteEntity : AuditableEntity() {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true, nullable = false)
    override var id: UUID? = null

    @Column(name = "name", nullable = false)
    var name: String? = null

    @Column(name = "description", nullable = false)
    var description: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", foreignKey = ForeignKey(name = "organization_fk"))
    var organization: OrganizationEntity? = null

    companion object {
        /**
         *
         */
        private const val serialVersionUID = -5184830352501999189L
    }
}