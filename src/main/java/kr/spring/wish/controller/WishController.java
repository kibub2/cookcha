package kr.spring.wish.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.spring.wish.domain.WishCommand;
import kr.spring.wish.service.WishService;

@Controller
public class WishController {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private WishService wishService;
	
	@RequestMapping("/wish/wish.do")
	public void select(@RequestParam("mem_id")String mem_id,
					   @RequestParam("shop_code")int shop_code,
							HttpSession session)throws Exception{
			if(log.isDebugEnabled()){
				log.debug("mem_id : "+mem_id);
				log.debug("shop_code : "+shop_code);
			}
			
			WishCommand wishCommand = wishService.getWishList(mem_id);
			
			if(wishCommand.getMem_id() == mem_id && wishCommand.getWish() == 1){
				wishService.deleteWish(mem_id, shop_code);
			}else{
				wishService.selectWish(mem_id, shop_code);
			}
	}
}