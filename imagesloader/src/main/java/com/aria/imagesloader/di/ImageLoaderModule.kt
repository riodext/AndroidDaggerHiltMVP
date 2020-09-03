package com.aria.imagesloader.di

import com.aria.imagesloader.GlideImageLoaderImpl
import com.aria.imagesloader.exposed.ImageLoader
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
internal abstract class ImageLoaderModule {

    @Binds
    abstract fun bindImageLoader(impl: GlideImageLoaderImpl): ImageLoader
}