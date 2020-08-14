package com.aria.androiddaggerhilt

import javax.inject.Inject

class GetWelcomeMessageDataSourceImpl @Inject constructor(
) : GetWelcomeMessageDataSource {

    override fun invoke(): WelcomeMessage {
        return WelcomeMessage("0", "Welcome MVP Hilt!")
    }
}