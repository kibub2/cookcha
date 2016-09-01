package kr.spring.member.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.member.domain.MemberCommand;

@Repository("memberMapper")
public interface MemberMapper {
	
	@Insert("INSERT INTO member(id, idnum, name, passwd, register, birth, sex, phone) VALUES (#{id}, membersequence.nextval, #{name}, #{passwd}, sysdate, #{birth}, #{sex}, #{phone})")
	public void insert(MemberCommand member);
	@Select("SELECT * FROM member WHERE id = ${id}")
	public MemberCommand select(String id);

}
