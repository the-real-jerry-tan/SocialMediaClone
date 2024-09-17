
    // Copyright (C) 2024, Jerry Tan
    // This is a common Kotlin Multiplatform file shared across iOS and Android.
    
    package com.example.shared

    // Common data model
    data class Post(val id: String, val userId: String, val imageUrl: String, val caption: String, val likes: Int)
    
    // Common repository interface
    interface PostRepository {
        fun fetchPosts(): List<Post>
    }
    
