package com.example.howtime;

import com.example.howtime.domain.Member;
import com.example.howtime.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@RequiredArgsConstructor
public class HowtimeApplication {
	public static void main(String[] args) {
		SpringApplication.run(HowtimeApplication.class, args);
	}

}
