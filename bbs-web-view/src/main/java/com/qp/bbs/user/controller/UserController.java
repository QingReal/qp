package com.qp.bbs.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qp.core.base.entity.Page;
import com.qp.core.message.entity.Message;
import com.qp.core.user.entity.User;
import com.qp.core.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService service;
	
	@RequestMapping(value="list")
	public ModelAndView index(HttpServletRequest request){
		Page page =  service.list(1, 10);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/list");
		System.out.println(page);
		mv.addObject("page",page);
		return mv;
	}
	
	@RequestMapping(value="login")
	public ModelAndView login(@RequestParam("email") String email, 
			@RequestParam("password") String password){
		ModelAndView mv = new ModelAndView();
		if(StringUtils.isEmpty(email) || StringUtils.isEmpty(password)){
			mv.setViewName(new Message("index","something is null").getPath());
			return mv;
		}
		
		Message msg = service.login(email, password);
		mv.setViewName(msg.getPath());
		return mv;
	}
	
}
