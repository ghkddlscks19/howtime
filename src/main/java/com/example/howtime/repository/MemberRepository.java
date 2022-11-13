package com.example.howtime.repository;

import com.example.howtime.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findBynickname(String nickname);


}
