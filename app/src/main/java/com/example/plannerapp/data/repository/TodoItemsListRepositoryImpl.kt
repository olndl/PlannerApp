package com.example.plannerapp.data.repository

import com.example.plannerapp.domain.models.TodoItem
import com.example.plannerapp.domain.repository.TodoItemsListRepository

object TodoItemsListRepositoryImpl: TodoItemsListRepository {

    private val todoList = mutableListOf<TodoItem>()

    private var autoIncrementId = 0

    override fun addItem(todo: TodoItem) {
        if (todo.id == TodoItem.UNDEFINED_ID) {
            todo.id = autoIncrementId++
        }
        todoList.add(todo)
    }

    override fun deleteItem(todo: TodoItem) {
        todoList.remove(todo)
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

    override fun getItemsList(): List<TodoItem> {
        return todoList.toList() // get copy
    }
}