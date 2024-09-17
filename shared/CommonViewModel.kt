
    // Copyright (C) 2024, User's Name
    // ViewModel shared across both platforms

    package com.example.shared

    import kotlinx.coroutines.flow.MutableStateFlow
    import kotlinx.coroutines.flow.StateFlow

    class PostViewModel(private val repository: PostRepository) {
        private val _posts = MutableStateFlow<List<Post>>(emptyList())
        val posts: StateFlow<List<Post>> get() = _posts

        fun loadPosts() {
            _posts.value = repository.fetchPosts()
        }
    }
    