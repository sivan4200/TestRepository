package com.demo.member.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.member.entity.Member;
import com.demo.member.service.MemberSerivce;
import com.demo.member.util.EmptyJsonResponse;


@RestController
public class MemberController {
	
	@Autowired
	private MemberSerivce memberSerivce;
	
	
	@GetMapping("/members")
	public ResponseEntity<List<Member>> getMembers(){
		return new ResponseEntity<List<Member>>(memberSerivce.getMembers(), HttpStatus.OK);
		
	}
	
	
	@GetMapping("/member/{memberId}")
	public ResponseEntity<Object> getMember(@PathVariable int memberId ){		
		if(memberSerivce.getMember(memberId).isEmpty()) {
			return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(memberSerivce.getMember(memberId), HttpStatus.OK);
		
		
	}
	
	
	
	  @PostMapping("/member") 
	  public ResponseEntity<Object>
	  createMember(@Valid @RequestBody Member member){ return new
	  ResponseEntity<Object>(memberSerivce.saveMember(member), HttpStatus.OK);
	  
	  }
	 
	
	@PutMapping("/member")
	public ResponseEntity<Object> updateMember(@Valid @RequestBody Member member){
		return new ResponseEntity<>(memberSerivce.saveMember(member), HttpStatus.OK);
		
		
	}
	
	
	/*
	 * @PostMapping("/member") public Member createMember(@Valid @RequestBody Member
	 * member){ return memberSerivce.saveMember(member);
	 * 
	 * }
	 */

}
