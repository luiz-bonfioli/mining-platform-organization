package com.mining.platform.organization.unit

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Unit Service
 *
 * @author luiz.bonfioli
 */
@Service
class UnitService : AbstractService<UnitEntity, UnitRepository>(), DataService<UnitEntity>