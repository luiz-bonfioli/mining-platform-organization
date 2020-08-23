package com.mining.platform.organization.checklist.item

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The ChecklistItem repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface ChecklistItemRepository : AbstractRepository<ChecklistItemEntity, UUID>
