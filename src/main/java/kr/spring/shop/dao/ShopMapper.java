package kr.spring.shop.dao;

import java.util.List;
import java.util.Map;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.domain.ShopReplyCommand;

@Repository
public interface ShopMapper {
	
	//가게상세
	@Insert("INSERT INTO shop(code,name,phone,address,sub_address,shop_rating,main_picture,back_picture,introduction,rater,classify,maxtable,able_book,able_coupon) "
			+ "VALUES (shop_seq.nextval,#{name},#{phone},#{address},#{sub_address},#{shop_rating},#{main_picture},#{back_picture},#{introduction},#{rater},#{classify},#{maxtable},#{able_book},#{able_coupon})")
	public void register(ShopCommand shop);
	
	@Select("SELECT MAX(code) FROM shop")
	public int lastShopCode();
	
	@Select("SELECT name FROM shop WHERE name LIKE '%'||#{name}||'%'")
	public String checkShop(String name);
	
	public List<ShopCommand> shopList(Map<String, Object> map);
	
	@Select("SELECT COUNT(*) FROM shop")
	public int getTotalCount();
	
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
	


	/*@Select("SELECT * FROM shop WHERE code=#{code}")
	public ShopCommand selectShop(int code);*/

}
