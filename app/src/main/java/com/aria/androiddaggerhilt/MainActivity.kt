package com.aria.androiddaggerhilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aria.androiddaggerhilt.databinding.ActivityMainBinding
import com.aria.imagesloader.exposed.ImageLoader
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var presenter: MainContract.Presenter

    @Inject
    lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.onViewCreated()
    }

    override fun showWelcomeMessage(welcomeMessage: WelcomeMessage) {
        binding.welcomeMessageTitle.text = welcomeMessage.title
        imageLoader.load(
            "https://www.techyourchance.com/wp-content/uploads/2020/06/dagger_hilt.jpeg",
            binding.welcomeMessageImageView
        )
    }
}