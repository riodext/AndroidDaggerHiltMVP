package com.aria.scopedscreen.presenter

import com.aria.scopedscreen.contract.HiltSummaryContract
import javax.inject.Inject

class HiltSummaryPresenter @Inject constructor(
    private val view: HiltSummaryContract.View
) : HiltSummaryContract.Presenter {

    override fun onViewCreated() {
        view.showUI()
    }
}