package kr.spring.rate.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.rate.dao.AddRatingMapper;
import kr.spring.rate.domain.RateCommand;
import kr.spring.shop.dao.ShopMapper;

@Service("rateService")
public class RateServiceImpl implements RateService {
	@Resource
	private AddRatingMapper addRatingMapper;
	
	@Override
	public void addRating(RateCommand rateCommand) {
		addRatingMapper.addRating(rateCommand);
	}

	@Override
	public List<RateCommand> ratedShop(RateCommand rateCommand) {
		return addRatingMapper.ratedShop(rateCommand);
	}

	@Override
	public void addRater(RateCommand rateCommand) {
		addRatingMapper.addRater(rateCommand);
	}

	@Override
	public int sumRating(RateCommand rateCommand) {
		return addRatingMapper.sumRating(rateCommand);
	}

	@Override
	public int countRating(RateCommand rateCommand) {
		return addRatingMapper.countRating(rateCommand);
	}

	@Override
	public void updateShopRating(RateCommand rateCommand) {
		addRatingMapper.updateShopRating(rateCommand);
		
	}

	@Override
	public RateCommand findRatedShop(RateCommand rateCommand) {
		return addRatingMapper.findRatedShop(rateCommand);
	}

	@Override
	public void updateRating(RateCommand rateCommand) {
		addRatingMapper.updateRating(rateCommand);
		
	}

	@Override
	public List<RateCommand> ratedShopList(String mem_id) {
		return addRatingMapper.ratedShopList(mem_id);
	}
	
}
