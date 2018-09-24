package com.picoscott

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class Goods(
        @Optional var goodsModel: String = "",
        @Optional var price: Float = 0F,
        @Optional var buyCount: String = "",
        @Optional var store: String = "",
        @Optional var enableStore: String = "",
        @Optional var preferential: String = "",
        @Optional var activity: String = "",
        @Optional var sid: String = "",
        @Optional var storeName: String = "",
        @Optional var minPrice: Float = 0F,
        @Optional var maxPrice: Float = 0F,
        @Optional var mainPic: String = "",
        @Optional var id: String = "",
        @Optional var storeId: String = "",
        @Optional var shopName: String = "",
        @Optional var storeStatus: String = "",
        @Optional var storeLogo: String = "",
        @Optional var name: String = "",
        @Optional var catId: String = "",
        @Optional var catName: String = "",
        @Optional var packing: String = "",
        @Optional var goodsStatus: String = "",
        @Optional var draftStatus: String = "",
        @Optional var checkStatus: String = "",
        @Optional var releaseTime: String = "",
        @Optional var basicServices: String = "",
        @Optional var distributionWayId: String = "",
        @Optional var haveWarrantyType: String = "",
        @Optional var haveMaintenanceSpecies: String = "",
        @Optional var modelTitle: String = "",
        @Optional var disabled: String = "",
        @Optional var shelfWay: String = "",
        @Optional var viewCount: Int = 0,
        @Optional var monthlySales: Int = 0,
        @Optional var commentsNum: Int = 0,
        @Optional var grade: String = "",
        @Optional var totalSold: Int = 0,
        @Optional var original: String = "",
        @Transient var tmpBuyCount: Int = 1,
        val productList: ArrayList<Product> = ArrayList()
) {
    init {
        println(this)
    }
}