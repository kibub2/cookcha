package kr.spring.admin.controller;

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
public class CheckShopAjaxController {
	private Logger log=Logger.getLogger(this.getClass());
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping("/admin/checkShop.do")
	public @ResponseBody Map<String, String> process(@RequestParam("name")String name){
		if(log.isDebugEnabled()){
			log.debug("name : " + name);
		}
		
		Map<String, String> map = new HashMap<String, String>();
		try{
			String duplicatedName = shopService.checkShop(name);
			//가게이름 중복 O
			if(duplicatedName!=null){
				map.put("result", "nameDuplicated");
				map.put("duplicatedName", duplicatedName);
			}else{
				map.put("result", "nameNotFound");
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



















