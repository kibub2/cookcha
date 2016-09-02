package kr.spring.member.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.member.domain.MemberCommand;

@Repository("memberMapper")
public interface MemberMapper {
	
	@Insert("INSERT INTO member(id, id_num, name, passwd, register, birth, sex, phone) VALUES (#{id}, member_seq.nextval, #{name}, #{passwd}, sysdate, #{birth}, #{sex}, #{phone})")
	public void insert(MemberCommand member);
	@Select("SELECT * FROM member WHERE id = #{id}")
	public MemberCommand select(String id);

}
