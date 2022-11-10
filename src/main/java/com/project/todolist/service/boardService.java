package com.project.todolist.service;

import com.project.todolist.entity.board;
import com.project.todolist.repository.boardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class boardService {

    @Transactional
    public List<board> search(String keyword){

        return boardList;
    }
}
