package kr.spring.shop.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.shop.dao.ShopMapper;
import kr.spring.shop.domain.ShopCommand;

@Service("shopService")
public class ShopServiceImpl implements ShopService{
	
	@Resource
	private ShopMapper shopMapper;
	
	@Override
	public void insert(ShopCommand shopCommand) {
		shopMapper.insert(shopCommand);
		
	}

	@Override
	public ShopCommand select(int code) {
		
		return shopMapper.select(code);
	}

	@Override
	public List<ShopCommand> list(Map<String, Object> map) {
		
		return shopMapper.list(map);
	}

}
