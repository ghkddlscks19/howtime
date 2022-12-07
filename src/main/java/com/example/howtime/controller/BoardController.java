package com.example.howtime.controller;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.BoardCreation;
import com.example.howtime.domain.Member;
import com.example.howtime.service.BoardService;
import com.example.howtime.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    private final MemberService memberService;

    @PostMapping("/create")
    public ResponseEntity<BoardCreation> create(@RequestBody BoardCreation board) {
        System.out.println(board.getMemberId() + "!!!!!!!!!!!");
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(boardService.create(board));
    }

    @GetMapping("/create/all")
    public List<Board> getBoard(){
        System.out.println("getBoard() 입장");
        return boardService.getBoard();
    }

    @GetMapping("/create/{boardid}")
    public Board getClickBoard(@PathVariable("boardid") int boardId){
        return boardService.getClickBoard(boardId).get();
    }

    @DeleteMapping("/delete/{boardid}")
    public void deleteBoard(@PathVariable("boardid") int boardId){
        boardService.deleteBoard(boardId);
    }

//    @PatchMapping("/modify/{boardId}")
//    public BoardCreation modifyBoard(@PathVariable("boardid") int boardId) {
//
//    }


}
