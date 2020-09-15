package com.aria.scopedscreen.di

import androidx.fragment.app.Fragment
import com.aria.scopedscreen.contract.HiltSummaryContract
import com.aria.scopedscreen.view.HiltSummaryFragment
import com.aria.scopedscreen.presenter.HiltSummaryPresenter
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class HiltSummaryModule {

    @Binds
    abstract fun bindFragment(
        fragment: HiltSummaryFragment
    ): HiltSummaryContract.View

    @Binds
    abstract fun bindPresenter(
        presenter: HiltSummaryPresenter
    ): HiltSummaryContract.Presenter
}

@InstallIn(FragmentComponent::class)
@Module
object HiltSummaryFragmentModule {

    @Provides
    fun provideHiltSummaryFragment(fragment: Fragment): HiltSummaryFragment {
        return fragment as HiltSummaryFragment
    }
}

