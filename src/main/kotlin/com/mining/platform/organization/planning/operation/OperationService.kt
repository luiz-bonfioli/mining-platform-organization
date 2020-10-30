package com.mining.platform.organization.planning.operation

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

/**
 * The Operation service
 *
 * @author luiz.bonfioli
 */
@Service
class OperationService : AbstractService<OperationEntity, OperationRepository>(), DataService<OperationEntity> {

    override fun findByParentIdAndParams(pageable: Pageable, parentId: UUID, search: Map<String, String>): Page<OperationEntity> =
            repository.findByProductionOrderIdAndCodeContains(parentId, search.getOrDefault("code", ""), pageable)
}

