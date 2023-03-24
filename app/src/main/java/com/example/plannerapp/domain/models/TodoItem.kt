package com.example.plannerapp.domain.models

data class TodoItem(
    val title: String,
    val count: Int,
    val visibility: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}