package com.mining.platform.organization.company

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.organization.equipment.EquipmentEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Company service
 *
 * @author luiz.bonfioli
 */
@Service
class CompanyService : AbstractService<CompanyEntity, CompanyRepository>(), DataService<CompanyEntity> {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<CompanyEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

}
