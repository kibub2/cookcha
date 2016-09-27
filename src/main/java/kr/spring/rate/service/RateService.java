package kr.spring.rate.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import kr.spring.rate.domain.RateCommand;

@Transactional
public interface RateService {
	public void addRating (RateCommand rateCommand);
	public List<RateCommand> ratedShop(RateCommand rateCommand);
	public void addRater(RateCommand rateCommand);
	public int sumRating(RateCommand rateCommand);
	public int countRating(RateCommand rateCommand);
	public void updateShopRating(RateCommand rateCommand);
	public RateCommand findRatedShop(RateCommand rateCommand);
	public void updateRating(RateCommand rateCommand);
	public List<RateCommand> ratedShopList(String mem_id);
}
