package com.mining.platform.organization.planning.order

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The ProductionOrder service
 *
 * @author luiz.bonfioli
 */
@Service
class ProductionOrderService : AbstractService<ProductionOrderEntity, ProductionOrderRepository>(),
        DataService<ProductionOrderEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<ProductionOrderEntity> =
            repository.findByDescriptionContains(search.getOrDefault("description", ""), pageable)
}

