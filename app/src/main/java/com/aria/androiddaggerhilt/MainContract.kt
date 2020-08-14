package com.aria.androiddaggerhilt

interface MainContract {

    interface View {
        fun showWelcomeMessage(welcomeMessage: WelcomeMessage)
    }

    interface Presenter {
        fun onViewCreated()
    }
}