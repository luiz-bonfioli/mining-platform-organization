package com.mining.platform.organization.user

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The User controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/user")
class UserController : AbstractController<UserEntity, User, UserService>() {

    override val valueObjectClass: KClass<User>
        get() = User::class

}
