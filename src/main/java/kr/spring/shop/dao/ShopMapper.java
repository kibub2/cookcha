package kr.spring.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.domain.ShopReplyCommand;

@Repository
public interface ShopMapper {
	
	//가게상세
	public List<ShopCommand> list(Map<String, Object> map);
	public int getRowCount(Map<String, Object> map);
	public void insert(ShopCommand shopCommand);
	@Select("SELECT * FROM shop WHERE code=#{code}")
	public ShopCommand select(int code);
	
	//가게댓글
	@Select("SELECT * FROM comm")
	public List<ShopReplyCommand> listReply(Map<String,Object> map);
	@Select("SELECT count(*) FROM comm WHERE code = #{code}")
	public int getRowCountReply(Map<String,Object> map);
	public void insertReply(ShopReplyCommand shopReplyCommand);
	public void updateReply(ShopReplyCommand shopReplyCommand);
	public void deleteReply(Integer no);
	
}
