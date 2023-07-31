package com.aswingt.bookshelf.network.model

import com.google.gson.annotations.SerializedName


data class Items (

    @SerializedName("kind"       ) var kind       : String?     = null,
    @SerializedName("id"         ) var id         : String?     = null,
    @SerializedName("etag"       ) var etag       : String?     = null,
    @SerializedName("selfLink"   ) var selfLink   : String?     = null,
    @SerializedName("volumeInfo" ) var volumeInfo : VolumeInfo? = VolumeInfo(),
    @SerializedName("saleInfo"   ) var saleInfo   : SaleInfo?   = SaleInfo(),
    @SerializedName("accessInfo" ) var accessInfo : AccessInfo? = AccessInfo(),
    @SerializedName("searchInfo" ) var searchInfo : SearchInfo? = SearchInfo()

)