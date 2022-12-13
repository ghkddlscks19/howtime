package com.example.howtime.repository;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.BoardCreation;
import com.example.howtime.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer>{

    List<Board> findBoardByMemberId(Member memberId);

    @Query(value = "SELECT b FROM Board b WHERE b.hashtag LIKE %:keyword% OR b.content LIKE %:keyword% OR b.title LIKE %:keyword%")
    List<Board> searchBoard(String keyword);

}
