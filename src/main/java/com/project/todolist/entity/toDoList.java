package com.project.todolist.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class toDoList {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String content;

    @Column
    @NotNull
    private boolean completed;
}
