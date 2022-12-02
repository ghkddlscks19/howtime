package com.example.howtime.repository;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
