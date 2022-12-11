package com.example.howtime.controller;

import com.example.howtime.domain.Answer;
import com.example.howtime.domain.AnswerCreation;
import com.example.howtime.domain.Board;
import com.example.howtime.domain.BoardCreation;
import com.example.howtime.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {
    private final AnswerService answerService;

    // 댓글 생성
    @PostMapping("/create")
    public ResponseEntity<AnswerCreation> create(@RequestBody AnswerCreation answerCreation) {
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(answerService.create(answerCreation));
    }

    // 댓글 전체 받아오기
    @GetMapping("/create/{boardid}")
    public List<Answer> getAnswer(@PathVariable("boardid") int boardId){
        return answerService.getAnswer(boardId);
    }

}
