package com.eliascoelho911.nexo.data.dto.anthropic.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestMetadata(
    @SerialName("user_id")
    val userId: String? = null
)
