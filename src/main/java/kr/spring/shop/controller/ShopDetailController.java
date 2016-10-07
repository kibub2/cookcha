package kr.spring.shop.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;

@Controller
public class ShopDetailController {
Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping(value="/shop/detail.do", method=RequestMethod.GET)
	public ModelAndView process(@RequestParam("code") int code) {
		
		if(log.isDebugEnabled()){
			log.debug("code : " + code);
		}
		
		ShopCommand shop = shopService.selectShop(code);

		return new ModelAndView("shopDetail", "shop", shop);
	}

}
