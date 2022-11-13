package com.example.howtime;

import com.example.howtime.domain.Member;
import com.example.howtime.repository.MemberRepository;
import com.example.howtime.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HowtimeApplicationTests {

	@Autowired
	private MemberRepository memberRepository;

	@Transactional
	@Test
	void 회원가입() {
		Member member = new Member();
		member.setStudentNum("2018101019");
		member.setPassword("1111");
		member.setName("황인찬");
		member.setNickname("SP찬");
		member.setGender("남성");
		member.setEmail("ghkddlscks19@naver.com");
		String studentNum = "2018101019";
		String password = "1111";
		String name = "황인찬";
		String nickname = "SP찬";
		String gender = "남성";
		String email = "ghkddlscks19@naver.com";
		memberRepository.save(member);

		List<Member> memberList = memberRepository.findAll();

		Member members = memberList.get(0);
		assertThat(members.getStudentNum()).isEqualTo(studentNum);
		assertThat(members.getPassword()).isEqualTo(password);
		assertThat(members.getName()).isEqualTo(name);
		assertThat(members.getGender()).isEqualTo(gender);
		assertThat(members.getEmail()).isEqualTo(email);

	}

}
