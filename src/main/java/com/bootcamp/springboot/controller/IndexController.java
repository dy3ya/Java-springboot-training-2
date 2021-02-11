package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.config.ServerConfig;
import com.bootcamp.springboot.model.todoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.springboot.service.todoService;

import java.util.List;

@RestController
@RequestMapping({"/","/index"})
public class IndexController {

    private todoService TODOservice;
    private ServerConfig serverConfigs;

    @Autowired
    private IndexController(todoService TODOservice, ServerConfig serverConfigs)
    {

        this.TODOservice = TODOservice;
        this.serverConfigs = serverConfigs;
    }

    @GetMapping("/list")
        ResponseEntity<List<todoModel>> getTodoList(){
        List<todoModel> todoList = this.TODOservice.getTodoModel();

        System.out.println(this.serverConfigs.getServer());
        return new ResponseEntity<>(todoList, HttpStatus.OK);
    }

}
