package com.example.howtime.repository;

import com.example.howtime.domain.BoardCreation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BoardCreationRepository extends JpaRepository<BoardCreation, Integer> {
//    @Modifying
//    @Query("UPDATE Board SET p.title = :title WHERE p.id = :id")
//    BoardCreation updateBoard(String title, Long id);
}
