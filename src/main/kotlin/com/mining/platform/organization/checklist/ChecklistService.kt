package com.mining.platform.organization.checklist

import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Checklist service
 *
 * @author luiz.bonfioli
 */
@Service
class ChecklistService : AbstractService<ChecklistEntity, ChecklistRepository>(), DataService<ChecklistEntity>
