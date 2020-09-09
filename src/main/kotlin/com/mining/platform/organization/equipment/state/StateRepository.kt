package com.mining.platform.organization.equipment.state

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The State repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface StateRepository : AbstractRepository<StateEntity, UUID>
