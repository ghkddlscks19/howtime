package com.example.howtime.repository;

import com.example.howtime.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    // 글 id로 조회
    List<Answer> findByBoardId(int boardId);
}
