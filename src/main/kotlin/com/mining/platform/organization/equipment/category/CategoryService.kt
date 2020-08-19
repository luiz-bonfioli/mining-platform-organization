package com.mining.platform.organization.equipment.category

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Category service
 *
 * @author luiz.bonfioli
 */
@Service
class CategoryService : AbstractService<CategoryEntity, CategoryRepository>(), DataService<CategoryEntity>
