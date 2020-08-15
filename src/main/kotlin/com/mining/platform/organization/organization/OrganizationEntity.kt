package com.mining.platform.organization.organization

import com.mining.platform.core.audit.AuditListener
import com.mining.platform.core.audit.AuditableEntity
import com.mining.platform.organization.site.SiteEntity
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Where
import java.util.*
import javax.persistence.*

/**
 * The Organization Entity
 *
 * @author luiz.bonfioli
 */
@Entity
@Table(name = "organization")
@Where(clause = "entity_status <> 'DELETED'")
@EntityListeners(AuditListener::class)
class OrganizationEntity : AuditableEntity() {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true, nullable = false)
    override var id: UUID? = null

    @Column(name = "name", nullable = false)
    var name: String? = null

    @Column(name = "description", nullable = false)
    var description: String? = null

    @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY)
    var sites: List<SiteEntity>? = null

    companion object {
        /**
         * Generated Serial
         */
        private const val serialVersionUID = -1068192679419519841L
    }
}