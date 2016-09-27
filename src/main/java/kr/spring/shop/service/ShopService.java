package kr.spring.shop.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.shop.domain.ShopCommand;

@Transactional
public interface ShopService {
	public void register(ShopCommand shop);
	public int lastShopCode();
	public String checkShop(String name);
	public List<ShopCommand> shopList(Map<String, Object> map);
	public int getTotalCount();
	public ShopCommand selectShop(int code);
}
