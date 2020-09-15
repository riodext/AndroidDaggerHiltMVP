package com.aria.androiddaggerhilt.data

import com.aria.androiddaggerhilt.model.WelcomeMessage
import javax.inject.Inject

class GetWelcomeMessageDataSourceImpl @Inject constructor(
) : GetWelcomeMessageDataSource {

    override fun invoke(): WelcomeMessage {
        return WelcomeMessage("0", "Welcome MVP Hilt!")
    }
}