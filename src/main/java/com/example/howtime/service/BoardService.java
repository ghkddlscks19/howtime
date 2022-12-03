package com.example.howtime.service;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.BoardCreation;
import com.example.howtime.domain.Member;
import com.example.howtime.repository.BoardCreationRepository;
import com.example.howtime.repository.BoardRepository;
import com.example.howtime.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    private final MemberRepository memberRepository;

    private final BoardCreationRepository boardCreationRepository;

    public BoardCreation create(BoardCreation board) {
        return boardCreationRepository.save(board);
    }

    public List<Board> getBoard() {
        return this.boardRepository.findAll();
    }

}
