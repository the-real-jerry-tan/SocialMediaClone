
    // Copyright (C) 2024, User's Name
    // Main Activity for Android app

    package com.example.androidApp

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.material.Text
    import androidx.lifecycle.viewmodel.compose.viewModel
    import com.example.shared.PostViewModel

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                val viewModel: PostViewModel = viewModel()
                // Display posts in the feed
                FeedScreen(viewModel)
            }
        }
    }
    