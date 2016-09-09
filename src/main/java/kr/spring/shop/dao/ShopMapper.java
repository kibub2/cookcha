package kr.spring.shop.dao;

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
	
}
