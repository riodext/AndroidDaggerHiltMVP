package com.aria.imagesloader

import android.content.Context
import android.widget.ImageView
import com.aria.imagesloader.exposed.ImageLoader
import com.bumptech.glide.Glide
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

internal class GlideImageLoaderImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : ImageLoader {

    override fun load(url: String, imageView: ImageView) {

        Glide.with(context)
            .load(url)
            .centerCrop()
            .into(imageView)
    }
}