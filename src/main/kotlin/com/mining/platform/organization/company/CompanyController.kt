package com.mining.platform.organization.company

import com.mining.platform.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KClass

/**
 * The Company controller
 *
 * @author luiz.bonfioli
 */
@RestController
@RequestMapping("/api/company")
class CompanyController : AbstractController<CompanyEntity, Company, CompanyService>() {

    override val valueObjectClass: KClass<Company>
        get() = Company::class

}
