package com.aria.imagesloader.exposed

import android.widget.ImageView

interface ImageLoader {

    fun load(url: String, imageView: ImageView)
    fun getMessage(): String
}