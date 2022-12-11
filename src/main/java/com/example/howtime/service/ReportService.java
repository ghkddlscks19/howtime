package com.example.howtime.service;

import com.example.howtime.domain.*;
import com.example.howtime.repository.ReportCreationRepository;
import com.example.howtime.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;

    private final ReportCreationRepository reportCreationRepository;

    // 신고 글 생성
    public ReportCreation create(ReportCreation report) {
        return reportCreationRepository.save(report);
    }

    // 신고 글 전체 불러오기
    public List<Report> getReport() {
        return this.reportRepository.findAll();
    }

    // 클릭한 신고 글 불러오기
    public Optional<Report> getClickReport(int boardId){
        return this.reportRepository.findById(boardId);
    }

    // 신고 글 수정하기
    public ReportCreation updateReport(ReportCreation reportCreation){
        return this.reportCreationRepository.save(reportCreation);
    }

    // 신고 글 삭제하기
    public void deleteReport(int boardId){
        this.reportRepository.deleteById(boardId);
    }

    // 내 신고 글 정보 가져오기
    public List<Report> getMyReport(Member memberId){
        return this.reportRepository.findBoardByMemberId(memberId);
    }
}
