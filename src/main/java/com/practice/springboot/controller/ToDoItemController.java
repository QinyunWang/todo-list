package com.practice.springboot.controller;

import com.practice.springboot.model.ToDoItem;
import com.practice.springboot.model.ToDoItemRequest;
import com.practice.springboot.service.ToDoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class ToDoItemController {

    private final ToDoItemService todoItemService;

    @PostMapping("/todo-item")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveToDoItem(@RequestBody ToDoItemRequest toDoItemRequest) {
        todoItemService.saveToDoItem(toDoItemRequest.toToDoItem());
    }

    @GetMapping("/todo-item")
    @ResponseStatus(HttpStatus.OK)
    public List<ToDoItem> findToDoItems() {
        return todoItemService.findToDoItems();
    }

    @DeleteMapping("/todo-item/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteToDoItem(@PathVariable Long id) {
        todoItemService.deleteToDoItem(id);
    }
}
