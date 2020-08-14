package com.aria.androiddaggerhilt

import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainPresenterTest {
    private val view: MainContract.View = mock()
    private val getWelcomeMessageDataSource: GetWelcomeMessageDataSource = mock()
    private lateinit var presenter: MainPresenter

    @BeforeEach
    fun setUp() {
        presenter = MainPresenter(view, getWelcomeMessageDataSource)
    }

    @DisplayName(
        """
            Given welcome message
            When view is created
            Then show welcome message
        """
    )
    @Test
    fun shouldShowWelcomeMessage() {
        givenWelcomeMessage()

        presenter.onViewCreated()

        verify(view).showWelcomeMessage(eq(createWelcomeMessage()))
    }

    private fun givenWelcomeMessage() {
        given(getWelcomeMessageDataSource())
            .willReturn(createWelcomeMessage())
    }

    private fun createWelcomeMessage() =
        WelcomeMessage("0", "Testing welcome message")
}