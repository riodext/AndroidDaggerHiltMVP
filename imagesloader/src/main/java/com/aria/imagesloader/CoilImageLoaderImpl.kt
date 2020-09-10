package com.aria.imagesloader

import android.widget.ImageView
import coil.load
import com.aria.imagesloader.exposed.ImageLoader
import javax.inject.Inject

internal class CoilImageLoaderImpl @Inject constructor(
) : ImageLoader {

    override fun load(url: String, imageView: ImageView) {
        imageView.load(url) {
            crossfade(true)
        }
    }
}