package com.example.howtime.repository;

import com.example.howtime.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    // 글 id로 조회
    @Query("select a from Answer a where a.boardId = :boardId")
    List<Answer> findByBoardId(int boardId);

}
