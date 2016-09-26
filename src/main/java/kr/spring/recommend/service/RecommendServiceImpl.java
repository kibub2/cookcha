package kr.spring.recommend.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.spring.recommend.dao.RecommendMapper;
import kr.spring.recommend.domain.MahoutRecommendCommand;

@Service("recommendService")
public class RecommendServiceImpl implements RecommendService {
	
	@Resource
	private RecommendMapper recommendMapper;
	@Override
	public List<MahoutRecommendCommand> mahoutList() {
		return recommendMapper.mahoutList();
	}
}
