package kr.spring.shop.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import kr.spring.shop.domain.ShopCommand;

@Transactional
public interface ShopService {
	
	public List<ShopCommand> list(Map<String, Object> map);
	public void insert(ShopCommand shopCommand);
	public ShopCommand select(int code);
}
