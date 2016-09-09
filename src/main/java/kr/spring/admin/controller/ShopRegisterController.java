package kr.spring.admin.controller;


import java.io.File;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import kr.spring.shop.domain.ShopCommand;
import kr.spring.shop.service.ShopService;
import kr.spring.util.FileUtil;



@Controller
public class ShopRegisterController {
	
	private Logger log=Logger.getLogger(this.getClass());
	
	@Resource
	private ShopService shopService;
	
	
	
	@RequestMapping(value="/admin/shopRegister.do", method=RequestMethod.GET)
	public String form(HttpSession session, Model model){
		
		ShopCommand shop=new ShopCommand();
		
		model.addAttribute("shop",shop);
		
		return "shopRegister";
	}
	
	@RequestMapping(value="/admin/shopRegister.do", method=RequestMethod.POST)
	public String submit(ShopCommand shop, SessionStatus status, 
						@RequestParam Map<String, String> param, 
						@RequestParam("upload1")MultipartFile multi1,
						@RequestParam("upload2")MultipartFile multi2)throws Exception{
		
		shop.setUpload1(multi1);
		shop.setUpload1(multi1);
		shop.setName(param.get("name"));
		shop.setPhone(param.get("phone"));
		shop.setAddress(param.get("address"));
		shop.setSub_address(param.get("sub_address"));
		shop.setClassify(Integer.parseInt(param.get("classify")));
		shop.setAble_coupon(Integer.parseInt(param.get("able_coupon")));
		
	
		
		if(log.isDebugEnabled()){
			log.debug("shopCommand : "+shop);
		}
	    
		
		
		
		
		String newName1="";
		String newName2="";
		System.out.println("shop.");
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










