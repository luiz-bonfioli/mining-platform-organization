package com.mining.platform.organization.location

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.organization.equipment.state.StateEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

/**
 * The Location service
 *
 * @author luiz.bonfioli
 */
@Service
class LocationService : AbstractService<LocationEntity, LocationRepository>(), DataService<LocationEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<LocationEntity> =
            repository.findByParentIdIsNullAndNameContains(search.getOrDefault("name", ""), pageable)

    override fun findByParentIdAndParams(pageable: Pageable, parentId: UUID, search: Map<String, String>): Page<LocationEntity> =
            repository.findByParentIdAndNameContains(parentId, search.getOrDefault("name", ""), pageable)
}
