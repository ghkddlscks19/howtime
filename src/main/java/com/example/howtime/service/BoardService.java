package com.example.howtime.service;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.BoardCreation;
import com.example.howtime.domain.Member;
import com.example.howtime.repository.BoardCreationRepository;
import com.example.howtime.repository.BoardRepository;
import com.example.howtime.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    private final BoardCreationRepository boardCreationRepository;

    // 글 생성
    public BoardCreation create(BoardCreation board) {
        return boardCreationRepository.save(board);
    }

    // 글 전체 받아오기
    public List<Board> getBoard() {
        return this.boardRepository.findAll();
    }

    // 선택한 글 정보 받아오기
    public Optional<Board> getClickBoard(int boardId){
        return this.boardRepository.findById(boardId);
    }


    // 글 삭제하기
    public void deleteBoard(int boardId){
        this.boardRepository.deleteById(boardId);
    }

    // 글 수정하기
    public BoardCreation updateBoard(BoardCreation boardCreation){
        return this.boardCreationRepository.save(boardCreation);
    }

    // 내 글 정보 가져오기
    public List<Board> getMyBoard(Member memberId){
        return this.boardRepository.findBoardByMemberId(memberId);
    }
}
