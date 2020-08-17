package com.mining.platform.organization

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan("com.mining.platform.organization", "com.mining.platform.core")
@EnableJpaRepositories("com.mining.platform.organization", "com.mining.platform.core")
@EntityScan("com.mining.platform.organization", "com.mining.platform.core")
class MiningPlatformOrganizationApplication

fun main(args: Array<String>) {
    runApplication<MiningPlatformOrganizationApplication>(*args)
}
