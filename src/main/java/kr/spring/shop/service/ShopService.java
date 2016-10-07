package kr.spring.shop.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.domain.ShopReplyCommand;


@Transactional
public interface ShopService {
	
	
	public List<ShopCommand> shopList(Map<String, Object> map);
	public int getRowCount(Map<String, Object> map);
	public void register(ShopCommand shop);
	public ShopCommand select(int code);
	public int lastShopCode();
	public String checkShop(String name);
	public List<ShopCommand> recommendShopList(String districtName);
	public int getTotalCount();
	public ShopCommand selectShop(int code);
	
	
	//가게댓글
	public List<ShopReplyCommand> listReply(Map<String,Object> map);
	public int getRowCountReply(Map<String,Object> map);
	public void insertReply(ShopReplyCommand shopReplyCommand);
	public void updateReply(ShopReplyCommand shopReplyCommand);
	public void deleteReply(Integer no);
}
