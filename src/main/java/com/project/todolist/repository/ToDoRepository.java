package com.project.todolist.repository;

import com.project.todolist.entity.toDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<toDoList, Long> {


}
