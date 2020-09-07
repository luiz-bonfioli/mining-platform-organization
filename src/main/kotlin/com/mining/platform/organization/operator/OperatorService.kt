package com.mining.platform.organization.operator

import com.mining.platform.core.communication.CommunicationService
import com.mining.platform.core.communication.MessageListener
import com.mining.platform.core.communication.protocol.Protocol
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.operator.OperatorPackageOuterClass.OperatorListPackage
import com.mining.platform.operator.OperatorPackageOuterClass.OperatorPackage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.logging.Level

/**
 * The Operator service
 *
 * @author luiz.bonfioli
 */
@Service
class OperatorService : AbstractService<OperatorEntity, OperatorRepository>(), DataService<OperatorEntity>, MessageListener {

    @Autowired
    private lateinit var communicationService: CommunicationService

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<OperatorEntity> =
            repository.findByNameContains(search.getOrDefault("name", ""), pageable)

    override fun onMessageArrived(eventId: Byte, payload: ByteArray, source: String) {
        when (eventId) {
            Protocol.Event.OPERATOR_LIST -> onOperatorListRequested()
            else -> logger.log(Level.SEVERE, "There isn't any implementation for event id: ${String.format("%02X", eventId)}")
        }
    }

    private fun onOperatorListRequested() {
        val operators = findAll().map { operator ->
            OperatorPackage.newBuilder().apply {
                id = operator.id?.toString()
                name = operator.name
                register = operator.register
            }.build()
        }
        publishOperatorList(OperatorListPackage.newBuilder().addAllOperators(operators))
    }

    private fun publishOperatorList(builder: OperatorListPackage.Builder) {
        communicationService.publish(Protocol.Topic.BASIC_DATA_SYNC + Protocol.Topic.RESPONSE,
                Protocol.Service.OPERATOR,
                Protocol.Event.OPERATOR_LIST,
                builder.build().toByteArray()
        )
    }
}
