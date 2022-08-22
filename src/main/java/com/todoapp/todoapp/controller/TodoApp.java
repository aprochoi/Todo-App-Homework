package com.todoapp.todoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoApp {

    @GetMapping("/")
    public String HelloTodoApp() {
        return "To-do Application";
    }
}
