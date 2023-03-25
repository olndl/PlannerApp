package com.example.plannerapp.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.plannerapp.data.repository.TodoItemsListRepositoryImpl
import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.usecases.DeleteItemUseCase
import com.example.plannerapp.domain.usecases.EditItemUseCase
import com.example.plannerapp.domain.usecases.GetItemsListUseCase

class HomeViewModel : ViewModel() {

    private val repository = TodoItemsListRepositoryImpl // fix DI

    private val getItemListUseCase = GetItemsListUseCase(repository)
    private val deleteItemListUseCase = DeleteItemUseCase(repository)
    private val editItemListUseCase = EditItemUseCase(repository)

    val listItems = getItemListUseCase.getItemsList()

    fun deleteItem(todo: TodoItem) {
        deleteItemListUseCase.deleteItem(todo)
    }
    fun changeVisibilityState(todo: TodoItem) {
        val newTodo = todo.copy(visibility = !todo.visibility)
        editItemListUseCase.editItem(newTodo)
    }
}