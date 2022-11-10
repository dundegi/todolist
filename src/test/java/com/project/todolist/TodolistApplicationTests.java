package com.project.todolist;

import com.project.todolist.entity.toDoList;
import com.project.todolist.repository.ToDoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodolistApplicationTests {

	@Autowired
	private ToDoRepository toDoRepository;

	@Test
	void TestToDo(){
		toDoList todo1 = new toDoList();

		todo1.setContent("ㅎㅇㅎㅇ");
		todo1.setCompleted(Boolean.TRUE);
		this.toDoRepository.save(todo1);

		toDoList todo2 = new toDoList();
		todo2.setContent("hihi");
		todo2.setCompleted(Boolean.FALSE);
		this.toDoRepository.save(todo2);
		
	}
}
