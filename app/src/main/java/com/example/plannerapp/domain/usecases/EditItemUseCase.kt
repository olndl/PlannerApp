package com.example.plannerapp.domain.usecases

import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

class EditItemUseCase(
    private val repository: TodoItemsListRepository
) {

    fun editItem(todo: TodoItem) {
        repository.editItem(todo)
    }
}