package com.mining.platform.organization.equipment

import com.google.protobuf.ByteString
import com.mining.platform.core.converter.UUIDConverter
import com.mining.platform.core.service.AbstractService
import com.mining.platform.core.service.DataService
import com.mining.platform.user.UserPackageOuterClass.UserPackage
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

/**
 * The Equipment service
 *
 * @author luiz.bonfioli
 */
@Service
class EquipmentService : AbstractService<EquipmentEntity, EquipmentRepository>(), DataService<EquipmentEntity> {

    fun findByCategoryId(categoryId: UUID): Collection<EquipmentEntity> = repository.findByCategoryId(categoryId)

    override fun findByParams(pageable: Pageable, search: Map<String, String>): Page<EquipmentEntity> {

        //TODO
        val userPackage = UserPackage.newBuilder()
                .setId(ByteString.copyFrom(UUIDConverter.toBytes(UUID.randomUUID())))
                .setName("Luiz Bonfioli")
                .build()

        val bytes = userPackage.toByteArray()

        val user = UserPackage.parseFrom(bytes)
        println(user)
        println(user.id)
        println(user.name)

        return super.findAll(pageable)
    }
}