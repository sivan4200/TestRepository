package com.demo.member.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Member {
	
	Member(){
		
	}
	
	public Member(int memberId, @NotEmpty(message = "Name is mandatory") String memberName,
			@NotEmpty(message = "Address is mandatory") String memberAddress) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memberId;
	
	@NotEmpty(message = "Name is mandatory")
	private String memberName;
	
	@NotEmpty(message = "Address is mandatory")
	private String memberAddress;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	
	

}
