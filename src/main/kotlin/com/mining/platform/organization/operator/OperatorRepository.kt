package com.mining.platform.organization.operator

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Operator repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface OperatorRepository : AbstractRepository<OperatorEntity, UUID> {

    fun findByNameContains(name: String, pageable: Pageable): Page<OperatorEntity>

}
