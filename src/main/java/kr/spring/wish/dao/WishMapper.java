package kr.spring.wish.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.wish.domain.WishCommand;

@Repository
public interface WishMapper {
	
	public List<WishCommand> wishList(Map<String, Object>map);
	public int getRowCount(Map<String, Object>map);
	@Select("SELECT * FROM wishlist WHERE mem_id=#{mem_id}")
	public WishCommand getWishList(String mem_id);
	@Insert("INSERT INTO wishlist (wish_seq, res_code, mem_id, wish) values (wish_seq.nextval(), #{shop_code},#{mem_id},1)")
	public void selectWish(String mem_id, int shop_code);
	@Delete("DELETE FROM wishlist WHERE mem_id=#{mem_id} and res_code=#{shop_code}")
	public void deleteWish(String mem_id, int shop_code);
}
