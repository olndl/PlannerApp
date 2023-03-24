package com.example.plannerapp.domain.usecases

import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

class GetItemByIdUseCase(
    private val repository: TodoItemsListRepository
) {

    fun getItemById(id: Int) : TodoItem {
       return  repository.getItemById(id)
    }
}