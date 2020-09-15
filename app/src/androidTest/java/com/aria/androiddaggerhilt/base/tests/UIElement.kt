package com.aria.androiddaggerhilt.base.tests

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher


class UIElement(matcher: Matcher<View>) {

    private val element: ViewInteraction = onView(matcher)

    fun isDisplayed() {
        element.check(matches(ViewMatchers.isDisplayed()))
    }

    fun withText(text: String) {
        element.check(matches(ViewMatchers.withText(text)))
    }

}