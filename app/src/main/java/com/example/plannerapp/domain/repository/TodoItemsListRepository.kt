package com.example.plannerapp.domain.repository

import androidx.lifecycle.LiveData
import com.example.plannerapp.domain.models.TodoItem

interface TodoItemsListRepository {

    fun addItem(todo: TodoItem)

    fun deleteItem(todo: TodoItem)

    fun editItem(todo: TodoItem)

    fun getItemById(id: Int) : TodoItem

    fun getItemsList() : LiveData<List<TodoItem>>
}