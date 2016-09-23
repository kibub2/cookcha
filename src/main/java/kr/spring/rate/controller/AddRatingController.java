package kr.spring.rate.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.spring.rate.domain.RateCommand;
import kr.spring.rate.service.RateService;
import kr.spring.shop.service.ShopService;


@Controller
public class AddRatingController {
	private Logger log=Logger.getLogger(this.getClass());
	

	@Resource private RateService rateService;
	//@Resource private ShopService ShopService;
	
	@RequestMapping("/addRating.do")
	@ResponseBody
	public Map<String, String> process(@RequestParam("id")String id, HttpSession session){
		if(log.isDebugEnabled()){
			log.debug("id : "+id);
		}
		
		
		
		
		Map<String, String> map = new HashMap<String, String>();
		try{
			//str에 담아서 "-"를 구분자로 자름
			//code 	= 앞에자른부분은 가게 코드
			//value = 뒤에자른부분은 평가한 별점
			String str=id;
			String [] values=str.split("-");
			String mem_id=(String)session.getAttribute("userId");
			
			//로그인이 안되어 있을 경우
			if(mem_id==null){
				map.put("result", "requireLogin");
			}else{
				if(log.isDebugEnabled()){
					log.debug("mem_id : "+mem_id);
				}
				
				int code=Integer.parseInt(values[0]);
				int rating=Integer.parseInt(values[2]);	
				int width=rating*20;
				
				//받아온 정보를 rateCommand에 저장
				RateCommand rateCommand = new RateCommand();
				rateCommand.setMem_id(mem_id);
				rateCommand.setPrivate_rate(rating);
				rateCommand.setShop_code(code);
				
				
				
				//rate 테이블에 등록
				//별점 등록
				//지금 평가한 가게가
				//이전에 평가를 했는지 알기위해 db에서 검색후 rateCommand로 반환
				RateCommand findRatedShop = rateService.findRatedShop(rateCommand);
				
				
				if(findRatedShop != null){
					//이미 평가한 가게일 경우
					rateService.updateRating(rateCommand);
				}else{
					//평가하지 않은 가게일 경우
					rateService.addRating(rateCommand);
				}
				
				//평가자수 +1 등록
				rateService.addRater(rateCommand);
				
				//shop테이블에 등록
				//가게 평균 별점 갱신 등록
				double shop_rating = Math.round((double)rateService.sumRating(rateCommand)/rateService.countRating(rateCommand)*100)/100.0;
				log.debug("shop_rating : "+shop_rating);
				rateCommand.setShop_rating(shop_rating);
				rateService.updateShopRating(rateCommand);
				map.put("shop_rating", Double.toString(shop_rating));
				map.put("width", Integer.toString(width));
				map.put("code", Integer.toString(code));
				
				map.put("result", "success");
			}
		}catch(Exception e){
			log.error(e);
			map.put("result", "failure");
		}
		if(log.isDebugEnabled()){
			log.debug("map : "+map);
		}
		return map;
	}
}













