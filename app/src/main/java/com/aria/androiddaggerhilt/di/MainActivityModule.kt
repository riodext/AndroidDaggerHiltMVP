package com.aria.androiddaggerhilt.di

import androidx.appcompat.app.AppCompatActivity
import com.aria.androiddaggerhilt.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object MainActivityModule {

    @Provides
    fun bindActivity(activity: AppCompatActivity): MainActivity {
        return activity as MainActivity
    }
}