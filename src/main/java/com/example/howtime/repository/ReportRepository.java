package com.example.howtime.repository;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.Member;
import com.example.howtime.domain.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Integer> {

    List<Report> findBoardByMemberId(Member memberId);
}
