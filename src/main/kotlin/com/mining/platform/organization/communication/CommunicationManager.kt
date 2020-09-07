package com.mining.platform.organization.communication

import com.mining.platform.core.Application
import com.mining.platform.core.communication.CommunicationService
import com.mining.platform.core.communication.protocol.Protocol
import com.mining.platform.core.communication.topic.*
import com.mining.platform.organization.device.DeviceEntity
import com.mining.platform.organization.device.DeviceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.util.*
import java.util.logging.Level
import java.util.logging.Logger
import javax.annotation.PostConstruct

/**
 *
 * @author luiz.bonfioli
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class CommunicationManager {

    private val logger = Logger.getLogger(CommunicationManager::class.qualifiedName)

    @Autowired
    private lateinit var application: Application

    @Autowired
    private lateinit var deviceService: DeviceService

    @Autowired
    private lateinit var topicService: TopicService

    @Autowired
    private lateinit var communicationService: CommunicationService

    @PostConstruct
    private fun initialize() {
        try {
            buildServiceTopics()
            buildDeviceTopics()
            initializeCommunication()
        } catch (ex: Exception) {
            logger.log(Level.SEVERE, "Cannot build topics on starting server.", ex)
        }
    }

    private fun buildServiceTopics() {
        buildServiceInboundTopics()
        buildServiceOutboundTopics()
    }

    private fun buildServiceInboundTopics() {
        topicService.create(
                TopicUtils.formatTopicByApplication(Protocol.Topic.COMPANY, application.name),
                Protocol.Fanout.COMPANY_EVENT, TopicType.SERVICE_INBOUND,
                ExchangeType.SERVICE_FANOUT_EXCHANGE)

        topicService.create(
                Protocol.Topic.DIAGNOSTIC + Protocol.Topic.REQUEST,
                Protocol.Topic.MQTT_DEFAULT,
                TopicType.MQTT_INBOUND,
                ExchangeType.TOPIC_EXCHANGE)
    }

    private fun buildServiceOutboundTopics() {
        topicService.create(
                TopicUtils.formatTopicByApplication(Protocol.Topic.COMPANY, application.name),
                Protocol.Fanout.COMPANY_EVENT,
                TopicType.SERVICE_OUTBOUND,
                ExchangeType.SERVICE_FANOUT_EXCHANGE)

        topicService.create(
                Protocol.Topic.DIAGNOSTIC + Protocol.Topic.RESPONSE,
                Protocol.Topic.MQTT_DEFAULT,
                TopicType.MQTT_OUTBOUND,
                ExchangeType.TOPIC_EXCHANGE)
    }

    fun buildCompanyInboundTopics(companyToken: UUID): Collection<TopicEntity> {
        val topics: MutableList<TopicEntity> = ArrayList()

        return topics
    }

    fun buildCompanyOutboundTopics(companyToken: UUID): Collection<TopicEntity> {
        val topics: MutableList<TopicEntity> = ArrayList()

        return topics
    }

    private fun buildDeviceTopics() {
        for (device in deviceService.findAll()) {
            buildDeviceInboundTopics(device)
            buildDeviceOutboundTopics(device)
        }
    }

    fun buildDeviceInboundTopics(device: DeviceEntity): List<TopicEntity> {
        val topics: MutableList<TopicEntity> = ArrayList<TopicEntity>()
        //val companyToken: String = deviceEntity
        val deviceToken: String = device.id.toString()
//        val authenticationRequestTopic: String = TopicUtils
//                .formatTopic(Topic.SIGGA_AUTHENTICATION_REQUEST, companyToken, deviceToken)
//        topics.add(topicService.create(authenticationRequestTopic, Topic.MQTT_DEFAULT,
//                TopicType.MQTT_INBOUND, ExchangeType.TOPIC_EXCHANGE))
        return topics
    }

    fun buildDeviceOutboundTopics(deviceEntity: DeviceEntity): List<TopicEntity> {
        val topics: MutableList<TopicEntity> = ArrayList<TopicEntity>()
        //  val companyToken: String = deviceEntity.getCompanyToken().toString()
        val deviceToken: String = deviceEntity.id.toString()
//        val authenticationResponseTopic: String = TopicUtils
//                .formatTopic(Topic.SIGGA_AUTHENTICATION_RESPONSE, companyToken, deviceToken)
//        topics.add(topicService.create(authenticationResponseTopic, Topic.MQTT_DEFAULT,
//                TopicType.MQTT_OUTBOUND, ExchangeType.TOPIC_EXCHANGE))
        return topics
    }

    private fun initializeCommunication() {
        communicationService.initialize()
    }
}