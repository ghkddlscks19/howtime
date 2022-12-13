package com.example.howtime.service;

import com.example.howtime.domain.Answer;
import com.example.howtime.domain.AnswerCreation;
import com.example.howtime.domain.ReportAnswer;
import com.example.howtime.domain.ReportAnswerCreation;
import com.example.howtime.repository.ReportAnswerCreationRepository;
import com.example.howtime.repository.ReportAnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportAnswerService {

    private final ReportAnswerRepository reportAnswerRepository;

    private final ReportAnswerCreationRepository reportAnswerCreationRepository;

    // 신고 댓글 생성
    public ReportAnswerCreation create(ReportAnswerCreation reportAnswerCreation) {
        return reportAnswerCreationRepository.save(reportAnswerCreation);
    }

    // 신고 댓글 전체 받아오기
    public List<ReportAnswer> getReportAnswer(int reportId){
        return this.reportAnswerRepository.findByBoardId(reportId);
    }
}
