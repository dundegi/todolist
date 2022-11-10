package com.project.todolist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {

    @Id @GeneratedValue
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;


}
