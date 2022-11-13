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

    public Optional<Member> read(Long id) {
        return this.memberRepository.findById(id);
    }

    public void delete(Long id){
        memberRepository.deleteById(id);
    }

    public Member update(Long id,String nickname) {
        Member member = read(id).get();
        member.setNickname(nickname);
        return memberRepository.save(member);
    }

}
