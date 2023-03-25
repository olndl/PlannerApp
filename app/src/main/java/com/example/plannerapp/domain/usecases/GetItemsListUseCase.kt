package com.example.plannerapp.domain.usecases

import androidx.lifecycle.LiveData
import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

class GetItemsListUseCase(
    private val repository: TodoItemsListRepository
) {

    fun getItemsList() : LiveData<List<TodoItem>> {
        return repository.getItemsList()
    }
}