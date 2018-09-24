package com.picoscott

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class Result(
        var code: String = "",
        @Optional var msg: String = "",
        @Optional var data: Goods = Goods(),
        @Optional var status: Boolean = false
)