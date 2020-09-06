package com.mining.platform.organization.device

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Device controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/device")
class DeviceController : AbstractController<DeviceEntity, Device, DeviceService>() {

    override val valueObjectClass: KClass<Device>
        get() = Device::class

}
