package com.demo.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.member.*")
public class MemberDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberDemoApplication.class, args);
	}

}
