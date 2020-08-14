package com.aria.androiddaggerhilt

import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val view: MainContract.View,
    private val welcomeMessageDataSource: GetWelcomeMessageDataSource
) : MainContract.Presenter {

    override fun onViewCreated() {
        val welcomeMessage = welcomeMessageDataSource()
        view.showWelcomeMessage(welcomeMessage)
    }
}