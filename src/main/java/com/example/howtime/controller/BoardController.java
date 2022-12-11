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

    // 글 생성
    @PostMapping("/create")
    public ResponseEntity<BoardCreation> create(@RequestBody BoardCreation board) {
        System.out.println(board.getMemberId() + "!!!!!!!!!!!");
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(boardService.create(board));
    }

    // 전체 글 조회
    @GetMapping("/create/all")
    public List<Board> getBoard(){
        System.out.println("getBoard() 입장");
        return boardService.getBoard();
    }

    // 선택한 글 내용 받아오기
    @GetMapping("/create/{boardid}")
    public Board getClickBoard(@PathVariable("boardid") int boardId){
        return boardService.getClickBoard(boardId).get();
    }

    // 글 삭제
    @DeleteMapping("/delete/{boardid}")
    public void deleteBoard(@PathVariable("boardid") int boardId){
        boardService.deleteBoard(boardId);
    }

    // 글 수정
    @PatchMapping("/update/")
    public ResponseEntity<BoardCreation> updateBoard(@RequestBody BoardCreation boardCreation) {
        System.out.println(boardService.updateBoard(boardCreation).getId()+"!!!!!!!!!!!!!");
        return ResponseEntity.ok()
                .body(boardService.updateBoard(boardCreation));
    }

    // 내 글 받아오기
    @GetMapping("create/my/{memberid}")
    public List<Board> getMyBoard(@PathVariable("memberid") Member memberId) {
        System.out.println("getMyBoard() 입장!!!!!!!!!");
        return boardService.getMyBoard(memberId);
    }


}
