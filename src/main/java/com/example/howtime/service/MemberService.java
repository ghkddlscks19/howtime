package com.example.howtime.service;

import com.example.howtime.domain.Board;
import com.example.howtime.domain.Member;
import com.example.howtime.repository.MemberRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    //회원가입
    public Member create(Member member) {
        return this.memberRepository.save(member);
    }

    //학번 중복 체크
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

    //이메일 중복 체크
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

    //닉네임 중복 체크
    public Boolean checkNickname(String nickname) {
        if (memberRepository.findByNickname(nickname).size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 로그인 정보 확인 후 로그인
    public Boolean checkLogin(String studentNum, String password) {
        if (memberRepository.findByStudentNumAndPassword(studentNum, password).size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    // 로그인한 멤버 정보 받아오기
    public List<Member> loginMember(String studentNum) {
        return memberRepository.findByStudentNum(studentNum);
    }

}
