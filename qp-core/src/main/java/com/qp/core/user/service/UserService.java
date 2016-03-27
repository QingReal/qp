package com.qp.core.user.service;


import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.qp.core.base.service.impl.BaseServiceImpl;
import com.qp.core.message.entity.Message;
import com.qp.core.user.entity.User;

@Service
public class UserService extends BaseServiceImpl<User>{
	
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public User getUser(String email){
		SimpleExpression filter = Restrictions.eq("email", email);
		List<User> users = read(filter);
		return users.get(0);
	}
	
	/**
	 * 用户登录
	 * @param email
	 * @param password
	 * @return
	 */
	public Message login(String email,String password){
		
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(email, password);
		Message msg = new Message();
		try {
        	//执行认证操作. 
            subject.login(token);
            msg.setPath("redirect:/user/list");
        }catch (AuthenticationException ae) {
        	msg.setPath("index");
        }
		return msg;

	}

}
