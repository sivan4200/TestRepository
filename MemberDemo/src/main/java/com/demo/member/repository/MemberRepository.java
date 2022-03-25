package com.demo.member.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.member.entity.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Integer>{

}
