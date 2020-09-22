package com.aria.androiddaggerhilt.feature.mainactivity

import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.aria.androiddaggerhilt.GetWelcomeMessageDataSource
import com.aria.androiddaggerhilt.MainActivity
import com.aria.androiddaggerhilt.base.tests.BaseUiTest
import com.aria.androiddaggerhilt.di.WelcomeMessageDataSourceModule
import com.aria.androiddaggerhilt.testimplementations.WelcomeMessageDataSourceTest
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
@HiltAndroidTest
@UninstallModules(WelcomeMessageDataSourceModule::class)
class MainActivityInnerModuleTest : BaseUiTest<MainActivity>() {

    @InstallIn(ActivityComponent::class)
    @Module
    object WelcomeMessageDataSourceTestModule {
        @Provides
        fun welcomeMessageTest(): GetWelcomeMessageDataSource = WelcomeMessageDataSourceTest()
    }

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    override fun getTestActivity(): IntentsTestRule<MainActivity> =
        IntentsTestRule(MainActivity::class.java, true, false)

    override fun startIntentActivity() {
        launchActivity(null)
    }

    private val mainActivityPage =
        MainActivityPage()

    @Test
    fun mainActivityShowsTheCorrectFakeText() {

        at(mainActivityPage)

        mainActivityPage.withText("Testing with Hilt is awesome")
    }


}