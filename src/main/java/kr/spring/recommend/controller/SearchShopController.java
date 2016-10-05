package kr.spring.recommend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.recommend.domain.MahoutRecommendCommand;
import kr.spring.recommend.service.RecommendService;
import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;


@Controller
public class SearchShopController {
	
	private Logger log=Logger.getLogger(this.getClass());
	
	@Resource private ShopService shopService;
	
	@Resource
	private RecommendService recommendService;
	
	private DataModel model;
	@RequestMapping("/recommend/searchShop.do")
	public String form() throws TasteException{
		/*if(recommendService.mahoutList().get(0) != null){
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
				log.debug("由ъ�ㅽ�멸� ���듬����.");
			}
		}*/
		
		return "searchShop";
	}
	
	@ResponseBody
	@RequestMapping(value="/recommend/districtShop.do", method=RequestMethod.POST)
	public Map<String, Object> process(@RequestParam("id") String id){
	    
	    if(log.isDebugEnabled()){
			log.debug("id : " + id);
		}
	    Map<String, Object> map = new HashMap<String, Object>();
	    
	    List<ShopCommand> list = null;
	      
	    list = shopService.recommendShopList(id);
	  
	    /*ModelAndView mav = new ModelAndView();
		mav.setViewName("searchShop");
		mav.addObject("list", list);*/
	    map.put("list", list);
	    
	    return map;
	}
}
