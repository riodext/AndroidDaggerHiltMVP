package com.aria.androiddaggerhilt.data

import com.aria.androiddaggerhilt.model.WelcomeMessage

interface GetWelcomeMessageDataSource {

    operator fun invoke(): WelcomeMessage
}