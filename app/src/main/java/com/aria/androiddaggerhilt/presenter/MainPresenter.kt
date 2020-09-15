package com.aria.androiddaggerhilt.presenter

import com.aria.androiddaggerhilt.data.GetWelcomeMessageDataSource
import com.aria.androiddaggerhilt.contract.MainContract
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