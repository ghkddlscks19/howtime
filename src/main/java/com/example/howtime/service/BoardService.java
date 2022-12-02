package com.example.howtime.service;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.Member;
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

    public Board create(Board board) {
        return this.boardRepository.save(board);
    }

    public List<Board> getBoard() {
        return this.boardRepository.findAll();
    }

    public List<Member> getMember(String studentNum) {
        return this.memberRepository.findByStudentNum(studentNum);
    }

}
