package kr.spring.recommend.controller;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.model.GenericDataModel;
import org.apache.mahout.cf.taste.impl.model.GenericUserPreferenceArray;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.Preference;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.recommend.domain.MahoutRecommendCommand;
import kr.spring.recommend.service.RecommendService;


@Controller
public class SearchShopController {
	
	private Logger log=Logger.getLogger(this.getClass());
	
	
	@Resource
	private RecommendService recommendService;
	
	@RequestMapping("/member/searchShop.do")
	public ModelAndView form(HttpSession session) throws TasteException{
		/* 기법 추천 구현부분 시작 */
		
		String userId=(String) session.getAttribute("userId");
		int id_num=recommendService.getMem_id_num(userId);
	
		
		List<MahoutRecommendCommand> list=null;
		FastByIDMap<PreferenceArray> preferences = new FastByIDMap<PreferenceArray>();
		
		
		/*prefA.setUserID(0, list.get(0).getMem_id_num());
		prefA.setItemID(0, list.get(0).getShop_code());
		prefA.setValue(0, list.get(0).getPrivate_rate());
		
		prefA.setUserID(1, 21L);
		prefA.setItemID(1, 22L);
		prefA.setValue(1, 23.0f);
		
		Preference pref=prefA.get(1);
		System.out.println(pref.getItemID());*/
		
		/*for (MahoutRecommendCommand i : list){
			
			
			prefA.setUserID(index, i.getMem_id_num());
			prefA.setItemID(index, i.getShop_code());
			prefA.setValue(index, i.getPrivate_rate());
			
			preferences.put(i.getMem_id_num(), prefA);
			index++;
		}
		DataModel model=new GenericDataModel(preferences);
		
		System.out.println(model.getPreferencesFromUser(1L))*/;
		
		//아이디별로 정보 불러오기
		//불러와서 리스트에 넣기
		int maxMem_id_num=recommendService.maxMem_id_num();
		if(maxMem_id_num > 0){
			
			
			for(int i=0; i < maxMem_id_num; i++ ){
				list=recommendService.mahoutList(i);
				int privateCount=recommendService.privateCount(i);
				System.out.println("i : "+i);
				if(privateCount > 0){
					
					PreferenceArray prefA = new GenericUserPreferenceArray(privateCount);
					prefA.setUserID(0, i);
					for(int j=0; j<privateCount; j++){
						System.out.println("j : "+j);
						prefA.setItemID(j, list.get(j).getShop_code());
						prefA.setValue(j, list.get(j).getPrivate_rate());
					}
					preferences.put(i, prefA);
				}
			}
		}
		//리스트에 넣은 정보를 DataModel객체에 넣기
		DataModel model=new GenericDataModel(preferences);
		System.out.println(model.getPreferencesFromUser(1));
		
		//DataModel객체의 정보를 가지고 유사도, 관계도, 추천 매서드 생성
		UserSimilarity similarity=new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood=new ThresholdUserNeighborhood(0.1, similarity, model);
		UserBasedRecommender recommander=new GenericUserBasedRecommender(model, neighborhood, similarity);
		
		//가장 유사한 아이디 5개 표출
		long similarUserId[] = recommander.mostSimilarUserIDs(id_num, 5);
		
		
		/* 기법 추천 구현부분  끝*/
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("searchShop");
		mav.addObject("similarUserId", similarUserId);
		
		return mav;
	}
}
