package com.aswingt.bookshelf.network.model

import com.google.gson.annotations.SerializedName


data class SaleInfo (

  @SerializedName("country"     ) var country     : String?  = null,
  @SerializedName("saleability" ) var saleability : String?  = null,
  @SerializedName("isEbook"     ) var isEbook     : Boolean? = null

)