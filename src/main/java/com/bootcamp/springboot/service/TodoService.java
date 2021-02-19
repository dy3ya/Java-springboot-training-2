package com.bootcamp.springboot.service;

import com.bootcamp.springboot.model.todoModel;
import com.bootcamp.springboot.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    public static ArrayList<todoModel> todoList = new ArrayList<>();

    @Autowired
    TodoRepository todoRepository;

    dbService databaseService;

    @Autowired
    public TodoService(dbService databaseService) {
        this.databaseService = databaseService;
    }

    public List<todoModel> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<todoModel> getTodoById(todoModel todo) {
        return todoRepository.findById(todo.getId());
    }

    public void setTodoDescription(todoModel todo) {
        todoRepository.save(todo);
    }


    public void deleteTodo(todoModel todo) {
        todoRepository.delete(todo);
    }


    public void AddNewTodo(todoModel todo) {
        todoRepository.save(todo);
    }

}
