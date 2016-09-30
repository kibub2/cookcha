package kr.spring.recommend.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import kr.spring.recommend.domain.MahoutRecommendCommand;
import kr.spring.shop.domain.ShopCommand;

@Repository("recommendMapper")
public interface RecommendMapper {
	
	@Select("SELECT count(*) FROM rate")
	public int totalCount();
	
	@Select("SElECT shop_code, private_rate FROM rate WHERE mem_id_num = #{i}")
	public List<MahoutRecommendCommand> mahoutList(int i);
	
	@Select("SELECT MAX(mem_id_num) FROM rate")
	public int maxMem_id_num();
	
	@Select("SELECT count(*) FROM rate WHERE mem_id_num = #{i}")
	public int privateCount(int i);
	
	@Select("SELECT id_num FROM member WHERE id=#{id}")
	public int getMem_id_num(String id);

	public List<ShopCommand> weeklyShop(Map<String, Object> map);
	
	public int weeklyShopCount(Map<String, Object> map);
	
	
}
