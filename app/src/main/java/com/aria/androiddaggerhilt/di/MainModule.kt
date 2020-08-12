package com.aria.androiddaggerhilt.di

import androidx.appcompat.app.AppCompatActivity
import com.aria.androiddaggerhilt.MainActivity
import com.aria.androiddaggerhilt.MainContract
import com.aria.androiddaggerhilt.MainPresenter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class MainModule {

    /* Before I had:
    @Binds
    abstract fun bindActivity(activity: MainActivity): MainContract.View
    */
    @Binds
    abstract fun bindActivity(activity: AppCompatActivity): MainActivity

    @Binds
    abstract fun bindPresenter(impl: MainPresenter): MainContract.Presenter
}