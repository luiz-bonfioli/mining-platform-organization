package com.mining.platform.organization.operator

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Operator service
 *
 * @author luiz.bonfioli
 */
@Service
class OperatorService : AbstractService<OperatorEntity, OperatorRepository>(), DataService<OperatorEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<OperatorEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)
}
