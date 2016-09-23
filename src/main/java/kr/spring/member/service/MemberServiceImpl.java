package kr.spring.member.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.board.domain.BoardCommand;
import kr.spring.member.dao.MemberMapper;
import kr.spring.member.domain.MemberCommand;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Resource
	private MemberMapper memberMapper;

	@Override
	public void insert(MemberCommand member) {
		memberMapper.insert(member);
	}

	@Override
	public MemberCommand select(String id) {
		return memberMapper.select(id);
	}

}
