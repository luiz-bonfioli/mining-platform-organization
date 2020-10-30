package com.mining.platform.organization.planning.order

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The ProductionOrder repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface ProductionOrderRepository : AbstractRepository<ProductionOrderEntity, UUID> {

    fun findByDescriptionContains(description: String, pageable: Pageable): Page<ProductionOrderEntity>
}