package com.mining.platform.organization.device

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Device repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface DeviceRepository : AbstractRepository<DeviceEntity, UUID>
