package com.project.todolist.repository;

import com.project.todolist.entity.board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface boardRepository extends JpaRepository<board, Long> {

    public List<board> findByTitleContaining(String keyword);
}
