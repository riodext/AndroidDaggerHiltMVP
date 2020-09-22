package com.aria.androiddaggerhilt.base.tests

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.After
import org.junit.Before
import org.junit.Rule


abstract class BaseUiTest<T : Activity> {

    @Rule
    @JvmField
    var activityTestRule = this.getTestActivity()

    protected val context: Context = InstrumentationRegistry.getInstrumentation().targetContext

    fun at(page: Page) {
        page.at()
    }

    abstract fun getTestActivity(): IntentsTestRule<T>
    abstract fun startIntentActivity()

    fun launchActivity(intent: Intent?) {
        activityTestRule.launchActivity(intent)
    }

    @Before
    fun setUp() {
        startIntentActivity()
    }

    @After
    fun tearDown() {
        activityTestRule.finishActivity()
    }

}