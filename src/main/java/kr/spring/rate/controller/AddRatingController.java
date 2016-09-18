package kr.spring.rate.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.spring.shop.service.ShopService;

@Controller
public class AddRatingController {
	private Logger log=Logger.getLogger(this.getClass());
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping("/addRating.do")
	@ResponseBody
	public Map<String, String> process(@RequestParam("id")String id){
		if(log.isDebugEnabled()){
			log.debug("id : "+id);
		}
		//str에 담아서 "-"로 자른다
		//code 	= 평가한 가게 코드 
		//value = 평가한 점수
		String str=id;
		String [] values=str.split("-");
		String code=values[0];
		String rating=values[2];
		
		Map<String, String> map = new HashMap<String, String>();
		try{
			map.put("result", "success");
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













