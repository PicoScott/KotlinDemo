package com.picoscott

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class Product(
        @Optional var id: String = "",
        @Optional var goodsId: String = "",
        @Optional var barCode: String = "",
        @Optional var pic: String = "",
        @Optional var store: Int = 0,
        @Optional var price: Float = 0F,
        @Optional var cost: Float = 0F,
        @Optional var m1: String = "",
        @Optional var m2: String = "",
        @Optional var m3: String = "",
        @Optional var m4: String = "",
        @Optional var productPromotionInfo: String = "",
        @Optional var introductionPic: String = "",
        @Optional var specificationDiagram: String = "",
        @Optional var isDefault: String = "",
        @Optional var createTime: String = "",
        @Optional var updateTime: String = "",
        @Optional var isSelect: Boolean = false
)
