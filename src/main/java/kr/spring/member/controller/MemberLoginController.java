package kr.spring.member.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.member.domain.MemberCommand;
import kr.spring.member.service.MemberService;
  
@Controller
public class MemberLoginController {
	private Logger log = Logger.getLogger(this.getClass());

	@Resource
	private MemberService memberService;
	
	@ModelAttribute("command")
	public MemberCommand initCommand() {
		return new MemberCommand();
	}
	
	@RequestMapping(value="/member/login.do", method=RequestMethod.GET)
	public String form() {
		return "/member/memberLogin";
	}
	
	@RequestMapping(value="/member/login.do", method=RequestMethod.POST)
	public String submit(@ModelAttribute("command") @Valid MemberCommand memberCommand, BindingResult result, HttpSession session) {
		
		if(log.isDebugEnabled()) {
			log.debug("memberCommand : " + memberCommand);
		}
		
		if(result.hasFieldErrors("id") || result.hasFieldErrors("passwd")) {
			return form();
		}
		
		try{
			MemberCommand member = memberService.select(memberCommand.getId());
			boolean check = false;
			
			System.out.println(member);
		
			//DB에서 가져온 자바빈과 입력한 자바빈 passwd 값을 비교
			if(member != null){
				check = member.isCheckedPasswd(memberCommand.getPasswd());
			}
			//위 자바빈의 passwd 값이 일치해 true를 반환하였을 경우 session에 입력한 자바빈 id를 userId값으로 생성
			if(check && member.getGrade()==2){
				session.setAttribute("userId", memberCommand.getId());
				return "redirect:/index.do";
			}else if(check && member.getGrade()==1){
				session.setAttribute("userId", memberCommand.getId());
				return "redirect:/admin.do";
			}else{
				throw new Exception();
			}
		}catch(Exception e){
			result.reject("invalidIdOrPassword");
			return form();
		}
		
		
	}

}
