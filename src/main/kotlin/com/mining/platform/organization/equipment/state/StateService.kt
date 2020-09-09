package com.mining.platform.organization.equipment.state

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The State service
 *
 * @author luiz.bonfioli
 */
@Service
class StateService : AbstractService<StateEntity, StateRepository>(), DataService<StateEntity>
