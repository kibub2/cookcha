package kr.spring.wish.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.wish.domain.WishCommand;

@Transactional
public interface WishService {
	
	public List<WishCommand> wishList(Map<String, Object>map);
	public int getRowCount(Map<String, Object>map);
	public WishCommand getWishList(String mem_id);
	public void selectWish(String mem_id, int shop_code);
	public void deleteWish(String mem_id, int shop_code);
}
