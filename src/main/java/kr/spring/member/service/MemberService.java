package kr.spring.member.service;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.member.domain.MemberCommand;

@Transactional
public interface MemberService {
	
	public void insert(MemberCommand member);
	public MemberCommand select(String id);

}
