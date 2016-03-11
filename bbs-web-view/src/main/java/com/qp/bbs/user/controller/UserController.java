package com.qp.bbs.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qp.core.base.entity.Page;
import com.qp.core.user.entity.User;
import com.qp.core.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService service;
	
	@RequestMapping(value="list")
	public ModelAndView index(HttpServletRequest request){
		Page page =  service.list(new User(), 1, 10);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("common/layout");
		mv.addObject("list",page.getResult());
		return mv;
	}
	
}
