package kr.spring.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.board.domain.BoardCommand;
import kr.spring.member.domain.MemberCommand;

@Transactional
public interface MemberService {
	

	public void insert(MemberCommand member);
	public MemberCommand select(String id);

}
