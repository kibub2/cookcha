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
	public List<MahoutRecommendCommand> mahoutList(int i) {
		return recommendMapper.mahoutList(i);
	}
	@Override
	public int totalCount() {
		
		return recommendMapper.totalCount();
	}
	@Override
	public int maxMem_id_num() {
		
		return recommendMapper.maxMem_id_num();
	}
	@Override
	public int privateCount(int i) {
		
		return recommendMapper.privateCount(i);
	}
	@Override
	public int getMem_id_num(String id) {
		
		return recommendMapper.getMem_id_num(id);
	}
}
