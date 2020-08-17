package com.mining.platform.organization.equipment

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Equipment Repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface EquipmentRepository : AbstractRepository<EquipmentEntity, UUID>