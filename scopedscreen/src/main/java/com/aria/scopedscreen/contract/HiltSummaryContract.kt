package com.aria.scopedscreen.contract

interface HiltSummaryContract {

    interface Presenter {
        fun onViewCreated()
    }

    interface View {
        fun showUI()
    }
}