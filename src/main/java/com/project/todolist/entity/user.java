package com.project.todolist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {

    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String email;


}
