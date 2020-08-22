package com.mining.platform.organization.communication

import com.mining.platform.core.communication.protocol.Protocol
import com.mining.platform.core.service.ServiceMapping
import com.mining.platform.organization.equipment.EquipmentService
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

/**
 *
 * @author luiz.bonfioli
 */
@Component
class ServiceInjection {

    @PostConstruct
    private fun initialize() {
        ServiceMapping.inject(Protocol.Service.EQUIPMENT, EquipmentService::class)
    }
}