package kr.spring.recommend.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.ToIntBiFunction;

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
import org.apache.mahout.cf.taste.recommender.IDRescorer;
import org.apache.mahout.cf.taste.recommender.ItemBasedRecommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.rate.domain.RateCommand;
import kr.spring.rate.service.RateService;
import kr.spring.recommend.domain.MahoutRecommendCommand;
import kr.spring.recommend.service.RecommendService;
import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;


@Controller
public class SearchShopController {
	
	private Logger log=Logger.getLogger(this.getClass());
	
	
	@Resource
	private RecommendService recommendService;
	@Resource
	private ShopService shopService;
	@Resource
	private RateService rateService;
	
	
	@RequestMapping("/member/searchShop.do")
	public ModelAndView form(HttpSession session) throws TasteException{
		/* 기법 추천 구현부분 시작 */
		
		
		String userId=(String) session.getAttribute("userId");
		int id_num=recommendService.getMem_id_num(userId);
		
		
		List<MahoutRecommendCommand> list=null;
		FastByIDMap<PreferenceArray> preferences = new FastByIDMap<PreferenceArray>();
		
		
		
		//아이디별로 정보 불러오기
		//불러와서 리스트에 넣기
		int maxMem_id_num=recommendService.maxMem_id_num();
		if(maxMem_id_num > 0){
			
			
			for(int i=0; i < maxMem_id_num; i++ ){
				list=recommendService.mahoutList(i);
				int privateCount=recommendService.privateCount(i);
				
				if(privateCount > 0){
					
					PreferenceArray prefA = new GenericUserPreferenceArray(privateCount);
					prefA.setUserID(0, i);
					for(int j=0; j<privateCount; j++){
						
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
		UserBasedRecommender userRecommander=new GenericUserBasedRecommender(model, neighborhood, similarity);
		
		//가장 유사한 아이디 5개 표출
		List<RecommendedItem> kkk = userRecommander.recommend(id_num, 4);
		List<ShopCommand> shopList=new ArrayList<ShopCommand>();
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		if(kkk.size()>8){
			for(int i=0;i<4;i++){
				int shopCode=0;
				
				shopCode=(int)kkk.get(i).getItemID();
				
				//map.put(Integer.toString(i), shopCode);
				//map.put("shop"+Integer.toString(i), shopservice.selectShop(shopCode));
				System.out.println("i : "+i+" / shopCode : "+shopCode+" / shopCommand : "+shopService.selectShop(shopCode).getName());
				shopList.add(i , shopService.selectShop(shopCode));
				
			}
			map.put("result", "enough");
		}else{
			map.put("result", "notEnough");
		}
		
		
		/* 기법 추천 구현부분  끝*/
		
		List<RateCommand> ratingList=null;
		ratingList=rateService.ratedShopList(userId);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("searchShop");
		mav.addObject("map", map);
		mav.addObject("shopList",shopList);
		mav.addObject("ratingList",ratingList);
		
		return mav;
	}
}
