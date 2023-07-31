package com.aswingt.bookshelf.network.model

import com.google.gson.annotations.SerializedName


data class ImageLinks (

  @SerializedName("smallThumbnail" ) var smallThumbnail : String? = null,
  @SerializedName("thumbnail"      ) var thumbnail      : String? = null

)