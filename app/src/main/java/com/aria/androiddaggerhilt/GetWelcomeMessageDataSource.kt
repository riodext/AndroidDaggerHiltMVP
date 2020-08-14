package com.aria.androiddaggerhilt

interface GetWelcomeMessageDataSource {

    operator fun invoke(): WelcomeMessage
}