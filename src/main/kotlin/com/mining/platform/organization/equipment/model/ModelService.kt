package com.mining.platform.organization.equipment.model

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Model service
 *
 * @author luiz.bonfioli
 */
@Service
class ModelService : AbstractService<ModelEntity, ModelRepository>(), DataService<ModelEntity>
