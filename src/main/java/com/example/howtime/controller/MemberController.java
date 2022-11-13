package com.example.howtime.controller;

import com.example.howtime.domain.Member;
import com.example.howtime.repository.MemberRepository;
import com.example.howtime.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    private final MemberRepository memberRepository;

    @PostMapping("/create")
    public ResponseEntity<Member> create(@RequestBody Member member) {
        System.out.println("create() 입장");
        return ResponseEntity.ok()
                .body(memberService.create(member));
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Member> read(@PathVariable Long id) {
        return ResponseEntity.ok()
                .body(memberService.read(id).get());
    }

    @PutMapping("/update")
    public ResponseEntity<Member> read(@RequestParam Long id, @RequestParam String nickname) {
        return ResponseEntity.ok()
                .body(memberService.update(id, nickname));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        memberService.delete(id);
    }

    @RequestMapping("/all")
    public List<Member> getMember() {
        return memberRepository.findAll();
    }

    @RequestMapping("create/{id}")
    public Member getProductById(@PathVariable("id") Long id) {
        return memberRepository.findById(id).get();
    }
}
