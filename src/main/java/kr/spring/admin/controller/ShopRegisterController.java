package kr.spring.admin.controller;


import java.io.File;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;
import kr.spring.util.FileUtil;



@Controller
@SessionAttributes("shop")
public class ShopRegisterController {
	
	private Logger log=Logger.getLogger(this.getClass());
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping(value="/admin/shopRegister.do", method=RequestMethod.GET)
	public String form(){
		
		return "shopRegister";
	}
	
	@RequestMapping(value="/admin/shopRegister.do", method=RequestMethod.POST)
	public String submit(@ModelAttribute("shop") ShopCommand shop, SessionStatus status)throws Exception{
		
		if(log.isDebugEnabled()){
			log.debug("shopCommand : "+shop);
		}
		
		String newName1="";
		String newName2="";
		if(!shop.getUpload1().isEmpty()){
			newName1 = FileUtil.rename(shop.getUpload1().getOriginalFilename());
			shop.setMain_picture(newName1);
		}
		if(!shop.getUpload2().isEmpty()){
			newName2 = FileUtil.rename(shop.getUpload2().getOriginalFilename());
			shop.setBack_picture(newName2);
		}
		
		shopService.register(shop);
		status.setComplete();
		
		if(!shop.getUpload1().isEmpty()){
			File file=new File(FileUtil.UPLOAD_PATH+"/"+newName1);
			shop.getUpload1().transferTo(file);
		}
		if(!shop.getUpload2().isEmpty()){
			File file=new File(FileUtil.UPLOAD_PATH+"/"+newName2);
			shop.getUpload2().transferTo(file);
		}
		
		return "redirect:/admin/register.do";
		
	}
}










