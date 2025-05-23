package com.mining.platform.organization.checklist.entry

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The ChecklistEntry service
 *
 * @author luiz.bonfioli
 */
@Service
class ChecklistEntryService : AbstractService<ChecklistEntryEntity, ChecklistEntryRepository>(), DataService<ChecklistEntryEntity>
