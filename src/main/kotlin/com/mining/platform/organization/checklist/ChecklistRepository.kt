package com.mining.platform.organization.checklist

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Checklist repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface ChecklistRepository : AbstractRepository<ChecklistEntity, UUID> {

    fun findByNameContains(name: String, pageable: Pageable): Page<ChecklistEntity>

}
