package com.mining.platform.organization.checklist.item

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The ChecklistItem service
 *
 * @author luiz.bonfioli
 */
@Service
class ChecklistItemService : AbstractService<ChecklistItemEntity, ChecklistItemRepository>(), DataService<ChecklistItemEntity>
