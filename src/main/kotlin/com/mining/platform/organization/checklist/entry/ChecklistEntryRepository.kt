package com.mining.platform.organization.checklist.entry

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The ChecklistEntry repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface ChecklistEntryRepository : AbstractRepository<ChecklistEntryEntity, UUID>
