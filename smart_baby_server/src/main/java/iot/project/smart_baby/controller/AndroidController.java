package iot.project.smart_baby.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.validator.util.privilegedactions.GetConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import iot.project.smart_baby.model.Member;
import iot.project.smart_baby.service.MemberService;

@RestController
@RequestMapping("/android")
public class AndroidController {
	@Autowired
	MemberService service;
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	
	@RequestMapping(method = RequestMethod.POST, value="/join")
    public String join(HttpServletRequest httpServletRequest) throws Exception {
		String userId = httpServletRequest.getParameter("userId");
		String password = httpServletRequest.getParameter("password");
		String parName = httpServletRequest.getParameter("parName");
		String parBirth = httpServletRequest.getParameter("parBirth");
		String babyName = httpServletRequest.getParameter("babyName");
		Date babyBirth = sdf2.parse(httpServletRequest.getParameter("parBirth"));
		String email = httpServletRequest.getParameter("babyName");
		Date regDate, updateDate;
		if(httpServletRequest.getParameter("regDate").isEmpty()) {
			regDate = sdf1.parse(sdf1.format(new Date(System.currentTimeMillis())));
		}else {
			regDate = sdf1.parse(httpServletRequest.getParameter("regDate"));			
		}
		if(httpServletRequest.getParameter("updateDate").isEmpty()) {
			updateDate = sdf1.parse(sdf1.format(new Date(System.currentTimeMillis())));
		}else {
			updateDate = sdf1.parse(httpServletRequest.getParameter("updateDate"));			
		}
		
		Member member = new Member(userId, password, parName, parBirth, babyName, babyBirth, email, regDate, updateDate);
		service.join(member);
		
		return "ok";
    }
	
	@RequestMapping(method = RequestMethod.POST, value="/login")
	public String login(HttpServletRequest httpServletRequest) {
		String result = "why not";
		String param1 = httpServletRequest.getParameter("param1");
		if(param1.equals("isGood")) {
			result = "very good";
		}
		return result;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/list")
	public String list(HttpServletRequest httpServletRequest) {
		String result = "why not";
		String param1 = httpServletRequest.getParameter("param1");
		if(param1.equals("isGood")) {
			result = "very good";
		}
		return result;
	}
}
