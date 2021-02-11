package com.bootcamp.springboot.model;

public class todoModel {
    private String firstTodo;
    private String secondTodo;

    public todoModel(){

    }
    public todoModel(String firstTodo, String secondTodo){
        this.firstTodo = firstTodo;
        this.secondTodo = secondTodo;
    }

    public void setFirstTodo(String firstTodo){
        this.firstTodo = firstTodo;
    }
    public String getFirstTodo(){
        return  firstTodo;
    }
    public void setSecondTodo(){
        this.secondTodo = secondTodo;
    }
    public String getSecondTodo(){
        return secondTodo;
    }

}
