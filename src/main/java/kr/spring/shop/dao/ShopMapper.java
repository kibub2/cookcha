package kr.spring.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.shop.domain.ShopCommand;

@Repository("shopMapper")
public interface ShopMapper {
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
	
	/*@Select("SELECT * FROM shop WHERE code=#{code}")
	public ShopCommand selectShop(int code);*/
}
