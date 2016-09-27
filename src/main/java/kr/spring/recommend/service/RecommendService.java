package kr.spring.recommend.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import kr.spring.recommend.domain.MahoutRecommendCommand;

@Transactional
public interface RecommendService {
	public List<MahoutRecommendCommand> mahoutList(int i);
	public int totalCount();
	public int maxMem_id_num();
	public int privateCount(int i);
	public int getMem_id_num(String id);
}
