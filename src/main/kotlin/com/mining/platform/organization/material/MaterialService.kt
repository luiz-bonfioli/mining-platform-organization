package com.mining.platform.organization.material

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Material service
 *
 * @author luiz.bonfioli
 */
@Service
class MaterialService : AbstractService<MaterialEntity, MaterialRepository>(), DataService<MaterialEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<MaterialEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

}
