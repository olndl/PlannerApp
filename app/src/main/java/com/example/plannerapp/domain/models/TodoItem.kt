package com.example.plannerapp.domain.models

data class TodoItem(
    val id: Int,
    val title: String,
    val count: Int,
    val visibility: Boolean
)