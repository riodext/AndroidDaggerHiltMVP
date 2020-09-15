package com.aria.androiddaggerhilt.contract

import com.aria.androiddaggerhilt.model.WelcomeMessage

interface MainContract {

    interface View {
        fun showWelcomeMessage(welcomeMessage: WelcomeMessage)
    }

    interface Presenter {
        fun onViewCreated()
    }
}