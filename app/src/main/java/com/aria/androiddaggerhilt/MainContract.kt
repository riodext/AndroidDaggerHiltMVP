package com.aria.androiddaggerhilt

interface MainContract {

    interface View {
        fun showList()
    }

    interface Presenter {
        fun onViewCreated()
    }
}