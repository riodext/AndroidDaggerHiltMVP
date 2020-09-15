package com.aria.scopedscreen.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aria.scopedscreen.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltSummaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_summary)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, HiltSummaryFragment())
            .commit()
    }
}