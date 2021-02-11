package com.bootcamp.springboot.service;

import com.bootcamp.springboot.model.todoModel;
import java.util.ArrayList;
import java.util.List;

public class todoService {

    public List<todoModel> getTodoModel() {
        List<todoModel> todo = new ArrayList<>();
        todo.add(new todoModel("Buy", "Sell"));
        todo.add(new todoModel("Play", "Rest"));
        return todo;
    }
}
