package com.aria.imagesloader.di

import com.aria.imagesloader.CoilImageLoaderImpl
import com.aria.imagesloader.GlideImageLoaderImpl
import com.aria.imagesloader.exposed.ImageLoader
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
internal abstract class ImageLoaderModule {

    @Binds
    @GlideImageLoader
    abstract fun bindGlideImageLoader(impl: GlideImageLoaderImpl): ImageLoader

    @Binds
    @CoilImageLoader
    abstract fun bindCoilImageLoader(impl: CoilImageLoaderImpl): ImageLoader
}