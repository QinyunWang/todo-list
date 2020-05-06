package com.practice.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class ToDoItemRequest {

    @Size(max = 50, message = "Title length must be less than 250")
    protected String title;

    protected Date time;

    protected String description;

    public ToDoItem toToDoItem() {
        return ToDoItem.builder()
                .title(title)
                .time(time)
                .description(description)
                .build();
    }
}
