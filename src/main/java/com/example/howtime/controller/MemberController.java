package com.example.howtime.controller;

import com.example.howtime.domain.Member;
import com.example.howtime.repository.MemberRepository;
import com.example.howtime.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    //회원가입
    @PostMapping("/create")
    public ResponseEntity<Member> create(@RequestBody Member member) {
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(memberService.create(member));
    }

    //학번 중복확인
    @GetMapping("/check/student")
    public Boolean checkStudentNum(String studentNum){
        System.out.println("checkStudentNum() 입장");
        return memberService.checkStudentNum(studentNum);
    }

    //이메일 중복확인
    @GetMapping("/check/email")
    public Boolean checkEmail(String email){
        System.out.println("checkEmail() 입장");
        return memberService.checkEmail(email);
    }

    //닉네임 중복확인
    @GetMapping("/check/nickname")
    public Boolean checkNickname(String nickname){
        System.out.println("checkNickname() 입장");
        return memberService.checkNickname(nickname);
    }

    //회원정보 불러오기
    @GetMapping("/check/student/{studentnum}")
    public List<Member> loginMember(@PathVariable String studentnum){
        System.out.println("loginMember() 입장");
        return memberService.loginMember(studentnum);
    }

    @PostMapping("/login")
    public Boolean checkLogin(String studentNum, String password) {
        System.out.println("checkLogin() 입장");
        return memberService.checkLogin(studentNum, password);
    }

}
