package com.example.howtime.repository;

import com.example.howtime.domain.Answer;
import com.example.howtime.domain.ReportAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReportAnswerRepository extends JpaRepository<ReportAnswer, Integer> {

    // 신고글 id로 조회
    @Query("select a from ReportAnswer a where a.reportId = :reportId")
    List<ReportAnswer> findByBoardId(int reportId);
}
