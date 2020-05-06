package com.practice.springboot.repository;

import com.practice.springboot.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoItemRepository extends JpaRepository<ToDoItem, Long> {
    List<ToDoItem> findAllByOrderByTime();
}
