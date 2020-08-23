package com.mining.platform.organization.user

import com.mining.platform.core.datasource.AbstractRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The User repository
 *
 * @author luiz.bonfioli
 */
@Repository
interface UserRepository : AbstractRepository<UserEntity, UUID>
