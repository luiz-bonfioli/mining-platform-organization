package com.mining.platform.organization.device

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Device repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface DeviceRepository : AbstractRepository<DeviceEntity, UUID> {

}
