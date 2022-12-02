package com.example.howtime.controller;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.Member;
import com.example.howtime.service.BoardService;
import com.example.howtime.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    private final MemberService memberService;

    @PostMapping("/create")
    public ResponseEntity<Board> create(@RequestBody Board board) {
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(boardService.create(board));
    }

    @GetMapping("/create/all")
    public List<Board> getBoard(){
        System.out.println("getBoard() 입장");
        return boardService.getBoard();
    }

    @GetMapping("/create/{studentnum}")
    public List<Member> getMember(@PathVariable("studentnum") String studentNum) {
        System.out.println("getMember() 입장");
        return boardService.getMember(studentNum);
    }


}
