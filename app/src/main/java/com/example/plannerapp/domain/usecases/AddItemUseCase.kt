package com.example.plannerapp.domain.usecases

import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

class AddItemUseCase(
    private val repository: TodoItemsListRepository
    ) {

    fun addItem(todo: TodoItem) {
        repository.addItem(todo)
    }
}