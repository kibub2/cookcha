package kr.spring.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.spring.shop.domain.ShopCommand;

@Repository
public interface ShopMapper {
	

	public List<ShopCommand> list(Map<String, Object> map);
	public void insert(ShopCommand shopCommand);
	@Select("SELECT * FROM shop WHERE code=#{code}")
	public ShopCommand select(int code);
}
