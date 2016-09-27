package kr.spring.shop.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.shop.dao.ShopMapper;
import kr.spring.shop.domain.ShopCommand;

@Service("shopService")
public class ShopServiceImpl implements ShopService {
	@Resource
	private ShopMapper shopMapper;

	@Override
	public void register(ShopCommand shop) {
		
		shopMapper.register(shop);
	}

	@Override
	public int lastShopCode() {
		// TODO Auto-generated method stub
		return shopMapper.lastShopCode();
	}

	@Override
	public String checkShop(String name) {
		// TODO Auto-generated method stub
		return shopMapper.checkShop(name);
	}


	@Override
	public List<ShopCommand> shopList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return shopMapper.shopList(map);
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return shopMapper.getTotalCount();
	}


}
