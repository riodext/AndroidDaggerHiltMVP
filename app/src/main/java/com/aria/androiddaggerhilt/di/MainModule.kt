package com.aria.androiddaggerhilt.di

import android.app.Activity
import com.aria.androiddaggerhilt.GetWelcomeMessageDataSource
import com.aria.androiddaggerhilt.GetWelcomeMessageDataSourceImpl
import com.aria.androiddaggerhilt.MainActivity
import com.aria.androiddaggerhilt.MainContract
import com.aria.androiddaggerhilt.MainPresenter
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class MainModule {

    @Binds
    abstract fun bindActivity(activity: MainActivity): MainContract.View

    @Binds
    abstract fun bindPresenter(impl: MainPresenter): MainContract.Presenter

    @Binds
    abstract fun bindDataSource(
        impl: GetWelcomeMessageDataSourceImpl
    ): GetWelcomeMessageDataSource
}

@InstallIn(ActivityComponent::class)
@Module
object MainActivityModule {

    @Provides
    fun bindActivity(activity: Activity): MainActivity {
        return activity as MainActivity
    }
}