package com.mining.platform.organization.material

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Material Service
 *
 * @author luiz.bonfioli
 */
@Service
class MaterialService : AbstractService<MaterialEntity, MaterialRepository>(), DataService<MaterialEntity>