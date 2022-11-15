package com.example.howtime.service;

import com.example.howtime.domain.Member;
import com.example.howtime.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;



    public Member create(Member member) {
        return this.memberRepository.save(member);
    }


    public Boolean checkStudentNum(String studentNum) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(studentNum);
        System.out.println(memberRepository.findByStudentNum(studentNum).size());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");

        if (memberRepository.findByStudentNum(studentNum).size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean checkEmail(String email) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(email);
        System.out.println(memberRepository.findByEmail(email).size());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");

        if (memberRepository.findByEmail(email).size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
