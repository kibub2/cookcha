package kr.spring.shop.service;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.shop.domain.ShopCommand;

@Transactional
public interface ShopService {
	public void register(ShopCommand shop);
	public int lastShopCode();
}
