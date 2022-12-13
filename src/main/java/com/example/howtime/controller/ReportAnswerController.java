package com.example.howtime.controller;

import com.example.howtime.domain.Answer;
import com.example.howtime.domain.AnswerCreation;
import com.example.howtime.domain.ReportAnswer;
import com.example.howtime.domain.ReportAnswerCreation;
import com.example.howtime.service.AnswerService;
import com.example.howtime.service.ReportAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportAnswerController {
    private final ReportAnswerService reportAnswerService;

    // 신고 댓글 생성
    @PostMapping("/create/answer")
    public ResponseEntity<ReportAnswerCreation> create(@RequestBody ReportAnswerCreation reportAnswerCreation) {
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(reportAnswerService.create(reportAnswerCreation));
    }

    // 신고 댓글 전체 받아오기
    @GetMapping("/create/answer/{reportid}")
    public List<ReportAnswer> getReportAnswer(@PathVariable("reportid") int reportId){
        return reportAnswerService.getReportAnswer(reportId);
    }
}
