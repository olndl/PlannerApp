package com.example.plannerapp.domain.usecases

import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

class DeleteItemUseCase(
    private val repository: TodoItemsListRepository
) {

    fun deleteItem(todo: TodoItem){
        repository.deleteItem(todo)
    }
}