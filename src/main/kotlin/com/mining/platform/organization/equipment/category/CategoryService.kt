package com.mining.platform.organization.equipment.category

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Category service
 *
 * @author luiz.bonfioli
 */
@Service
class CategoryService : AbstractService<CategoryEntity, CategoryRepository>(), DataService<CategoryEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<CategoryEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

}
