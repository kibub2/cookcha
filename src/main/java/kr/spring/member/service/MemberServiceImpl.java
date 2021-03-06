package kr.spring.member.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.member.dao.MemberMapper;
import kr.spring.member.domain.MemberCommand;

@Service("memberService")
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

	@Override
	public int getRowCount(Map<String, Object> map) {
		
		return memberMapper.getRowCount(map);
	}

}
