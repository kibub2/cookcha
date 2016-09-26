package kr.spring.recommend.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.spring.recommend.domain.MahoutRecommendCommand;
import kr.spring.recommend.service.RecommendService;


@Controller
public class MapSearchShopController {
	
<<<<<<< HEAD:src/main/java/kr/spring/recommend/controller/MapSearchShopController.java
	@RequestMapping("/recommend/map-searchShop.do")
	public String form(){
		return "map-searchShop";
=======
	private Logger log=Logger.getLogger(this.getClass());
	
	
	@Resource
	private RecommendService recommendService;
	
	private DataModel model;
	@RequestMapping("/member/searchShop.do")
	public String form() throws TasteException{
		/* 기법 추천 구현부분 시작 */
		if(recommendService.mahoutList().get(0) != null){
			if(log.isDebugEnabled()){
				log.debug("@@@@@@@@@@@@@@@@@@"+recommendService.mahoutList().get(0).toString());
				log.debug("@@@@@@@@@@@@@@@@@@"+1);
			}
			List<MahoutRecommendCommand> list=recommendService.mahoutList();
			for (MahoutRecommendCommand i : list){
				model.setPreference(i.getMem_id_num(), i.getShop_code(), i.getPrivate_rate());
			}
			UserSimilarity similarity=new PearsonCorrelationSimilarity(model);
			UserNeighborhood neighborhood=new ThresholdUserNeighborhood(0.1, similarity, model);
			UserBasedRecommender recommander=new GenericUserBasedRecommender(model, neighborhood, similarity);
		}else{
			if(log.isDebugEnabled()){
				log.debug("리스트가 없습니다.");
			}
		}
		
		/* 기법 추천 구현부분  끝*/
		
		return "searchShop";
>>>>>>> origin/test-mahout:src/main/java/kr/spring/recommend/controller/SearchShopController.java
	}
}
