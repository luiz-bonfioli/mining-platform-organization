package com.mining.platform.organization.authentication

import com.mining.platform.organization.user.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * The authentication controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/authentication")
@CrossOrigin(origins = ["*"])
class AuthenticationController {

    @PostMapping
    fun save(@RequestBody credentials: Credentials): ResponseEntity<User> {
        return ResponseEntity.ok(User())
    }
}