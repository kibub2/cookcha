package kr.spring.blog.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import kr.spring.blog.domain.BlogCommand;

@Repository
public interface BlogMapper {

	
	
	public List<BlogCommand> recommUser(Map<String, Object>map);
	
}
