package kr.spring.recommend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import kr.spring.recommend.domain.MahoutRecommendCommand;

@Repository("recommendMapper")
public interface RecommendMapper {
	@Select("SELECT mem_id_num, shop_code, private_rate FROM rate")
	public List<MahoutRecommendCommand> mahoutList();
}
