package kr.spring.shop.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.shop.dao.ShopMapper;
import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.domain.ShopReplyCommand;

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


	@Override
	public ShopCommand selectShop(int code) {
	// TODO Auto-generated method stub
	return shopMapper.selectShop(code);
	}
	
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

	@Override
	public List<ShopReplyCommand> listReply(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return shopMapper.listReply(map);
	}

	@Override
	public int getRowCountReply(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return shopMapper.getRowCountReply(map);
	}

	@Override
	public void insertReply(ShopReplyCommand shopReplyCommand) {
		// TODO Auto-generated method stub
		shopMapper.insertReply(shopReplyCommand);
	}

	@Override
	public void updateReply(ShopReplyCommand shopReplyCommand) {
		// TODO Auto-generated method stub
		shopMapper.updateReply(shopReplyCommand);
	}

	@Override
	public void deleteReply(Integer no) {
		// TODO Auto-generated method stub
		shopMapper.deleteReply(no);
	}

	@Override
	public int getRowCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return shopMapper.getRowCount(map);

	}

}
