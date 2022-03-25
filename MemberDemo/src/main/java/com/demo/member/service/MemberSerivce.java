package com.demo.member.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.member.entity.Member;
import com.demo.member.repository.MemberRepository;

@Service
public class MemberSerivce {

	@Autowired
	private MemberRepository memberRepository;

	public Member saveMember(Member member) {
		return memberRepository.save(member);

	}

	public List<Member> getMembers() {
		List<Member> members = new ArrayList<>();
		memberRepository.findAll().forEach(members::add);
		return members;

	}

	public Optional<Member> getMember(int memberId) {
		return memberRepository.findById(memberId);

	}

}
