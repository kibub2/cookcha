package kr.spring.shop.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.spring.shop.domain.ShopReplyCommand;
import kr.spring.shop.service.ShopService;
import kr.spring.util.PagingUtil;

@Controller
public class ShopListReplyController {
	private Logger log = Logger.getLogger(this.getClass());
	private int rowCount = 10;
	private int pageCount = 10;
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping("/shop/listReplyAjax.do")
	@ResponseBody
	public Map<String,Object> process(@RequestParam(value="pageNum",defaultValue="1")
										int currentPage,
										@RequestParam("code")int code){
		if(log.isDebugEnabled()){
			log.debug("pageNum :"+currentPage);
			log.debug("code :"+code);
		}
		
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put("code", code);
		int count = shopService.getRowCountReply(hashMap);
		
		PagingUtil page = new PagingUtil
					(currentPage, count, rowCount, pageCount, "listReply.do");
		hashMap.put("start", page.getStartCount());
		hashMap.put("end", page.getEndCount());
		
		List<ShopReplyCommand> list = null;
		if(count > 0 ){
			list = shopService.listReply(hashMap);
		}else{
			list = Collections.emptyList();
		}
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("count", count);
		map.put("rowCount", rowCount);
		map.put("list", list);
		
		return map;
		
	}

}
