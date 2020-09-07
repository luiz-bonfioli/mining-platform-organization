package com.mining.platform.organization.device

import com.mining.platform.core.communication.MessageListener
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Device service
 *
 * @author luiz.bonfioli
 */
@Service
class DeviceService : AbstractService<DeviceEntity, DeviceRepository>(), DataService<DeviceEntity>, MessageListener {

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<DeviceEntity> =
            repository.findAll(pageable)

    override fun onMessageArrived(eventId: Byte, payload: ByteArray, source: String) {

    }
}
