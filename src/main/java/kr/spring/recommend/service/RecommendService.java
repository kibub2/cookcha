package kr.spring.recommend.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import kr.spring.recommend.domain.MahoutRecommendCommand;

@Transactional
public interface RecommendService {
	public List<MahoutRecommendCommand> mahoutList();
}
