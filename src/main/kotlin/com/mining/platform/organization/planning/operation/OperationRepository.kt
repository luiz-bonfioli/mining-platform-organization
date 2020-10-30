package com.mining.platform.organization.planning.operation

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Operation repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface OperationRepository : AbstractRepository<OperationEntity, UUID> {

    fun findByProductionOrderIdAndCodeContains(productionOrderId: UUID, code: String, pageable: Pageable): Page<OperationEntity>
}
