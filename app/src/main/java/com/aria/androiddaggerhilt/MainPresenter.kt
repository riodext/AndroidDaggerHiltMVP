package com.aria.androiddaggerhilt

import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val view: MainContract.View
) : MainContract.Presenter {

    override fun onViewCreated() {
        view.showList()
    }
}