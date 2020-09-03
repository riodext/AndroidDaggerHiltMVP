package com.aria.imagesloader

import android.widget.ImageView
import com.aria.imagesloader.exposed.ImageLoader
import javax.inject.Inject

internal class GlideImageLoaderImpl @Inject constructor(
) : ImageLoader {

    override fun load(url: String, imageView: ImageView) {
        /*
        Glide.with(myFragment)
            .load(url)
            .centerCrop()
            .into(imageView)
         */
    }

    override fun getMessage(): String {
        return "Hilt module!"
    }
}