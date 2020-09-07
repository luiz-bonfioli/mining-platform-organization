package com.mining.platform.organization.device

import com.mining.platform.core.communication.MessageListener
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.stereotype.Service

/**
 * The Device service
 *
 * @author luiz.bonfioli
 */
@Service
class DeviceService : AbstractService<DeviceEntity, DeviceRepository>(), DataService<DeviceEntity>, MessageListener {

    override fun onMessageArrived(eventId: Byte, payload: ByteArray, source: String) {

    }
}
