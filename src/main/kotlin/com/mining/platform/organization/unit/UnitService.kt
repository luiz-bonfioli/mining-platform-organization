package com.mining.platform.organization.unit

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Unit service
 *
 * @author luiz.bonfioli
 */
@Service
class UnitService : AbstractService<UnitEntity, UnitRepository>(), DataService<UnitEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<UnitEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

}
