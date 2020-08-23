package com.mining.platform.organization.location

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Location service
 *
 * @author luiz.bonfioli
 */
@Service
class LocationService : AbstractService<LocationEntity, LocationRepository>(), DataService<LocationEntity>
