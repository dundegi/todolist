package com.project.todolist.service;

import com.project.todolist.entity.toDoList;
import com.project.todolist.repository.ToDoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class toDoService {

    private final ToDoRepository toDoRepository;

    public List<toDoList> getList(){
        return toDoRepository.findAll();
    }
}
