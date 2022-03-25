package com.demo.member.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.demo.member.entity.Member;
import com.demo.member.repository.MemberRepository;
import com.demo.member.service.MemberSerivce;



@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MemberControllerTest {


	@InjectMocks
    MemberController memberController;
	
    @Mock
    MemberSerivce memberService;
    
   
	
	@Test
	public void testcreateMember() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		Member member = new Member(1, "Siva", "4200 W Lexinton st");
		when(memberService.saveMember(Mockito.any(Member.class))).thenReturn(member);
		ResponseEntity<Object> responseEntity = memberController.createMember(member);
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);

	}
    
	
	@Test
	public void testUpdateMember() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		Member member = new Member(1, "Siva", "4200 W Lexinton st");		
		when(memberService.saveMember(Mockito.any(Member.class))).thenReturn(member);
		ResponseEntity<Object> responseEntity = memberController.updateMember(member);
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);

	}
	 
	
	@Test
	public void testGetMemberSuccessCase() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		Member member = new Member(1, "Siva", "4200 W Lexinton st");
		when(memberService.getMember(1)).thenReturn(Optional.of(member));
		ResponseEntity<Object> responseEntity = memberController.getMember(member.getMemberId());
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);

	}
	 
}
