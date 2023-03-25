package com.example.plannerapp.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

object TodoItemsListRepositoryImpl: TodoItemsListRepository {

    private val listItems = MutableLiveData<List<TodoItem>>()

    private val todoList = mutableListOf<TodoItem>()

    private var autoIncrementId = 0

    init {
        for (i in 0..9) {
            val item = TodoItem("Make smth $i", i, true,)
            addItem(item)
        }
    }

    override fun addItem(todo: TodoItem) {
        if (todo.id == TodoItem.UNDEFINED_ID) {
            todo.id = autoIncrementId++
        }
        todoList.add(todo)
        updateList()
    }

    override fun deleteItem(todo: TodoItem) {
        todoList.remove(todo)
        updateList()
    }

    override fun editItem(todo: TodoItem) {
        todoList.remove(getItemById(todo.id))
        addItem(todo)
    }

    override fun getItemById(id: Int): TodoItem {
        return todoList.find {
            it.id == id
        } ?: throw java.lang.RuntimeException("element with id: $id is not found")
    }

    override fun getItemsList(): LiveData<List<TodoItem>> {
        return listItems // get copy
    }

    private fun updateList() {
        listItems.value = todoList.toList()
    }
}