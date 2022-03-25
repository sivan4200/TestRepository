package com.demo.member.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.member.entity.Member;

@DataJpaTest
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;

	@Test	
	public void saveMemberTest() {

		Member member = new Member(1, "Siva", "4200 Doran St");
		memberRepository.save(member);
		Optional<Member> memberFromRepo = memberRepository.findById(1);
		assertThat(memberFromRepo.get().getMemberId()).isEqualTo(1);

        
	}

}
