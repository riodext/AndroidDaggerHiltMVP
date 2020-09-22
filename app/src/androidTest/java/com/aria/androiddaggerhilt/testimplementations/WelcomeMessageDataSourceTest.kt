package com.aria.androiddaggerhilt.testimplementations

import com.aria.androiddaggerhilt.GetWelcomeMessageDataSource
import com.aria.androiddaggerhilt.WelcomeMessage
import javax.inject.Inject

class WelcomeMessageDataSourceTest @Inject constructor(
) : GetWelcomeMessageDataSource {

    override fun invoke(): WelcomeMessage {
        return WelcomeMessage(
            "0",
            "Testing with Hilt is awesome"
        )
    }
}