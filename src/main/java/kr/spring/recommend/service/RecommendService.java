package kr.spring.recommend.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;
import kr.spring.recommend.domain.MahoutRecommendCommand;
import kr.spring.shop.domain.ShopCommand;

@Transactional
public interface RecommendService {
	public List<MahoutRecommendCommand> mahoutList(int i);
	public int totalCount();
	public int maxMem_id_num();
	public int privateCount(int i);
	public int getMem_id_num(String id);
	public List<ShopCommand> weeklyShop(Map<String, Object> map);
	public int weeklyShopCount(Map<String, Object> map);
}
