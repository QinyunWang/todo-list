package com.practice.springboot.service;

import com.practice.springboot.model.ToDoItem;
import com.practice.springboot.repository.ToDoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoItemService {

    private final ToDoItemRepository toDoItemRepository;

    @Transactional
    public void saveToDoItem(ToDoItem item) {
        toDoItemRepository.save(item);
    }

    @Transactional
    public List<ToDoItem> findToDoItems() {
        return toDoItemRepository.findAllByOrderByTime();
    }

    @Transactional
    public void deleteToDoItem(Long id) {
        toDoItemRepository.deleteById(id);
    }
}
