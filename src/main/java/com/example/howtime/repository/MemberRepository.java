package com.example.howtime.repository;

import com.example.howtime.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    @Query("SELECT m FROM Member m WHERE m.studentNum = :studentNum")
    List<Member> findByStudentNum(String studentNum);

}
