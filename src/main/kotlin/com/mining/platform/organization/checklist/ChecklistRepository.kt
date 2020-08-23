package com.mining.platform.organization.checklist

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The Checklist repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface ChecklistRepository : AbstractRepository<ChecklistEntity, UUID>
