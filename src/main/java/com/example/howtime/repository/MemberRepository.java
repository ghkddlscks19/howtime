package com.example.howtime.repository;

import com.example.howtime.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    // 학번으로 멤버 정보 찾기
    @Query("SELECT m FROM Member m WHERE m.studentNum = :studentNum")
    List<Member> findByStudentNum(String studentNum);

    // 이메일 정보 찾기
    List<Member> findByEmail(String email);

    // 닉네임 정보 찾기
    List<Member> findByNickname(String nickname);

    // 학번과 패스워드로 정보 찾기
    List<Member> findByStudentNumAndPassword(String studentNum, String password);

}
