package kr.spring.rate.dao;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.lucene.store.RateLimitedDirectoryWrapper;
import org.springframework.stereotype.Repository;

import kr.spring.rate.domain.RateCommand;

@Repository("addRatingMapper")
public interface AddRatingMapper {
	@Insert("INSERT INTO rate (no, shop_code, mem_id, private_rate, rate_date)"
			+ " VALUES (rate_seq.nextval, #{shop_code}, #{mem_id}, #{private_rate}, sysdate)")
	public void addRating(RateCommand rateCommand);
	
	@Select("SELECT * FROM rate WHERE shop_code = #{shop_code}")
	public List<RateCommand> ratedShop(RateCommand rateCommand);
	
	@Update("UPDATE shop SET rater=rater+1 WHERE code = #{shop_code}")
	public void addRater(RateCommand rateCommand);
	
	@Select("SELECT SUM(private_rate) FROM rate WHERE shop_code=#{shop_code}")
	public int sumRating(RateCommand rateCommand);
	
	@Select("SELECT COUNT(*) FROM rate WHERE shop_code=#{shop_code}")
	public int countRating(RateCommand rateCommand);
	
	@Update("UPDATE shop SET shop_rating = #{shop_rating} WHERE code=#{shop_code}")
	public void updateShopRating(RateCommand rateCommand);
	
	@Select("SELECT * FROM rate WHERE mem_id=#{mem_id} AND shop_code=#{shop_code}")
	public RateCommand findRatedShop(RateCommand rateCommand);
	
	@Update("UPDATE rate SET private_rate=#{private_rate}, rate_date=sysdate WHERE mem_id=#{mem_id} AND shop_code=#{shop_code}")
	public void updateRating(RateCommand rateCommand);
	
	@Select("SELECT * FROM rate WHERE mem_id=#{mem_id}")
	public List<RateCommand> ratedShopList(String mem_id);
}
