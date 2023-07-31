package com.aswingt.bookshelf.network.model

import com.google.gson.annotations.SerializedName


data class AccessInfo (

  @SerializedName("country"                ) var country                : String?  = null,
  @SerializedName("viewability"            ) var viewability            : String?  = null,
  @SerializedName("embeddable"             ) var embeddable             : Boolean? = null,
  @SerializedName("publicDomain"           ) var publicDomain           : Boolean? = null,
  @SerializedName("textToSpeechPermission" ) var textToSpeechPermission : String?  = null,
  @SerializedName("epub"                   ) var epub                   : Epub?    = Epub(),
  @SerializedName("pdf"                    ) var pdf                    : Pdf?     = Pdf(),
  @SerializedName("webReaderLink"          ) var webReaderLink          : String?  = null,
  @SerializedName("accessViewStatus"       ) var accessViewStatus       : String?  = null,
  @SerializedName("quoteSharingAllowed"    ) var quoteSharingAllowed    : Boolean? = null

)