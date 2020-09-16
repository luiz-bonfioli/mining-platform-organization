package com.mining.platform.organization.equipment.state

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

/**
 * The State service
 *
 * @author luiz.bonfioli
 */
@Service
class StateService : AbstractService<StateEntity, StateRepository>(), DataService<StateEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<StateEntity> =
            repository.findByParentIdIsNullAndNameContains(search.getOrDefault("name", ""), pageable)

    override fun findByParentIdAndParams(pageable: Pageable, parentId: UUID, search: Map<String, String>): Page<StateEntity> =
            repository.findByParentIdAndNameContains(parentId, search.getOrDefault("name", ""), pageable)
}
