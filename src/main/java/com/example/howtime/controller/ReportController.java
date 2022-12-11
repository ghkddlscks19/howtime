package com.example.howtime.controller;

import com.example.howtime.domain.*;
import com.example.howtime.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    // 신고 글 생성
    @PostMapping("/create")
    public ResponseEntity<ReportCreation> create(@RequestBody ReportCreation report) {
        System.out.println(report.getMemberId() + "!!!!!!!!!!!");
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(reportService.create(report));
    }

    // 신고 글 전체 불러오기
    @GetMapping("/create/all")
    public List<Report> getReport(){
        System.out.println("getReport() 입장");
        return reportService.getReport();
    }

    // 클릭한 신고 글 불러오기
    @GetMapping("/create/{boardid}")
    public Report getClickBoard(@PathVariable("boardid") int boardId){
        return reportService.getClickReport(boardId).get();
    }

    // 신고 글 수정하기
    @PatchMapping("/update/")
    public ResponseEntity<ReportCreation> updateBoard(@RequestBody ReportCreation reportCreation) {
        System.out.println(reportService.updateReport(reportCreation).getId()+"!!!!!!!!!!!!!");
        return ResponseEntity.ok()
                .body(reportService.updateReport(reportCreation));
    }

    // 신고 글 삭제
    @DeleteMapping("/delete/{boardid}")
    public void deleteReport(@PathVariable("boardid") int boardId){
        reportService.deleteReport(boardId);
    }

    // 내 신고 글 받아오기
    @GetMapping("create/my/{memberid}")
    public List<Report> getMyReport(@PathVariable("memberid") Member memberId) {
        System.out.println("getMyBoard() 입장!!!!!!!!!");
        return reportService.getMyReport(memberId);
    }
}
