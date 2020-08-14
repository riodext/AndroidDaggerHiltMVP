package com.aria.androiddaggerhilt

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainPresenterTest {
    private val view: MainContract.View = mock()
    private lateinit var presenter: MainPresenter

    @BeforeEach
    fun setUp(){
        presenter = MainPresenter(view)
    }

    @DisplayName(
        """
            When view is created
            Then show list
        """
    )
    @Test
    fun shouldShowList() {
        presenter.onViewCreated()

        verify(view).showList()
    }
}