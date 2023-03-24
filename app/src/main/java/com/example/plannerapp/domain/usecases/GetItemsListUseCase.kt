package com.example.plannerapp.domain.usecases

import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

class GetItemsListUseCase(
    private val repository: TodoItemsListRepository
) {

    fun getItemsList() : List<TodoItem> {
        return repository.getItemsList()
    }
}