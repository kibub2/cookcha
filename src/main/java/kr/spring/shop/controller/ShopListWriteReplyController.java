package kr.spring.shop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.spring.shop.domain.ShopReplyCommand;
import kr.spring.shop.service.ShopService;

@Controller
public class ShopListWriteReplyController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping("/shop/writeReplyAjax.do")
	@ResponseBody
	public Map<String,String> process(ShopReplyCommand shopReplyCommand,
										HttpSession session){
		
		if(log.isDebugEnabled()){
			log.debug("shopReplyCommand : " + shopReplyCommand);
		}
		
		Map<String,String> map = new HashMap<String, String>();
		
		try{
			String userId = (String)session.getAttribute("userId");
			if(userId == null){//�α��� �ȵ�
				map.put("result", "logout");
			}else{//�α��� ��
				//��� ���
				shopService.insertReply(shopReplyCommand);
				map.put("result", "success");
			}
		}catch(Exception e){
			e.printStackTrace();
			map.put("result", "failure");
		}
		
		return map;
	}

}
