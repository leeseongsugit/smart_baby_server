package iot.project.smart_baby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import iot.project.smart_baby.service.MemberService;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm(Login login
			@)

}
