package com.aria.androiddaggerhilt.feature.mainactivity

import androidx.test.espresso.matcher.ViewMatchers.withId
import com.aria.androiddaggerhilt.R
import com.aria.androiddaggerhilt.base.tests.Page
import com.aria.androiddaggerhilt.base.tests.UIElement

class MainActivityPage : Page() {

    private val mainLayout =
        UIElement(withId(R.id.main_activity_constraint_main))

    private val welcomeMessage =
        UIElement(withId(R.id.welcome_message_title))

    override fun at() {
        mainLayout.isDisplayed()
    }

    fun withText(text: String) {
        welcomeMessage.withText(text)
    }

}