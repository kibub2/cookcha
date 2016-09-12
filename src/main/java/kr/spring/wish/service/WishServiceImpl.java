package kr.spring.wish.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import kr.spring.wish.dao.WishMapper;
import kr.spring.wish.domain.WishCommand;

public class WishServiceImpl implements WishService{
	
	@Resource
	private WishMapper wishMapper;

	@Override
	public List<WishCommand> wishList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return wishMapper.wishList(map);
	}

	@Override
	public int getRowCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return wishMapper.getRowCount(map);
	}

	@Override
	public void selectWish(String mem_id, int shop_code) {
		wishMapper.selectWish(mem_id, shop_code);
		
	}

	@Override
	public void deleteWish(String mem_id, int shop_code) {
		wishMapper.deleteWish(mem_id, shop_code);
	}

	@Override
	public WishCommand getWishList(String mem_id) {
		// TODO Auto-generated method stub
		return wishMapper.getWishList(mem_id);
	}
	
	
}
