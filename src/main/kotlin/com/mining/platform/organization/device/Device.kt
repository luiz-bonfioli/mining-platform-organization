package com.mining.platform.organization.device

import com.mining.platform.core.controller.ValueObject
import java.util.*

/**
 * The Device value object
 *
 * @author luiz.bonfioli
 */
data class Device(
        var id: UUID? = null,
        var serialNumber: String? = null
) : ValueObject<DeviceEntity> {

    override var entity: DeviceEntity
        get() = DeviceEntity(id, serialNumber)
        set(entity) {
            id = entity.id
            serialNumber = entity.serialNumber
        }
}
