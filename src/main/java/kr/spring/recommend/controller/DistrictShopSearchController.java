package kr.spring.recommend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.domain.BoardCommand;
import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;

@Controller
public class DistrictShopSearchController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource private ShopService shopService;
	
	@RequestMapping(value="/recommend/districtShop.do", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ModelAndView process(@RequestParam("id") String id)  {
	    
	    if(log.isDebugEnabled()){
			log.debug("id : " + id);
		}
	    
	    List<ShopCommand> list = null;
	    
	    /*System.out.println(id);
	    System.out.println(shopService.recommendShopList(id));*/
	    
	    list = shopService.recommendShopList(id);
	    
	    ModelAndView mav = new ModelAndView();
		mav.setViewName("recommendList");
		mav.addObject("list", list);
		
	    return mav;
	}
}
