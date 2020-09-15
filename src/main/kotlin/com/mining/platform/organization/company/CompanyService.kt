package com.mining.platform.organization.company

import com.mining.platform.company.CompanyCreatedPackageOuterClass.CompanyCreatedPackage
import com.mining.platform.core.communication.CommunicationService
import com.mining.platform.core.communication.MessageListener
import com.mining.platform.core.communication.protocol.Protocol
import com.mining.platform.core.converter.UUIDConverter
import com.mining.platform.core.infrastructure.DatabaseManager
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * The Company service
 *
 * @author luiz.bonfioli
 */
@Service
class CompanyService : AbstractService<CompanyEntity, CompanyRepository>(), DataService<CompanyEntity>, MessageListener {

    @Autowired
    private lateinit var communicationService: CommunicationService

    @Autowired
    private lateinit var databaseManager: DatabaseManager

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<CompanyEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

    override fun afterSave(entity: CompanyEntity) {
        super.afterSave(entity)
        notifyCompanyCreated(entity)
    }

    override fun onMessageArrived(eventId: Byte, payload: ByteArray, source: String) {
        val companyCreated = CompanyCreatedPackage.parseFrom(payload)
        if(companyCreated.companyId.isNotBlank()){
            val companyId = UUIDConverter.toUUID(companyCreated.companyId)
            databaseManager.buildDatabase(companyId)
        }
    }

    private fun notifyCompanyCreated(entity: CompanyEntity) {
        val builder = CompanyCreatedPackage.newBuilder().apply {
            companyId = entity.id?.toString()
        }.build()

        communicationService.publish(
                Protocol.Fanout.COMPANY_EVENT,
                Protocol.Fanout.COMPANY_EVENT,
                Protocol.Service.COMPANY,
                Protocol.Event.COMPANY_CREATED,
                builder.toByteArray())
    }
}
