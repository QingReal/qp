package com.qp.bbs.accounting.service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.util.ThreadContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qp.core.user.entity.Permission;
import com.qp.core.user.entity.Role;
import com.qp.core.user.entity.User;
import com.qp.core.user.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:/config/system/applicationContext.xml","classpath:/config/system/applicationContext-shiro.xml","classpath:/config/system/applicationContext-shiro-test.xml"})  
public class AccoutingServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Resource
	private UserService userService;
	@Resource
	private org.apache.shiro.mgt.SecurityManager securityManager ;
	
	@Before
	public void setup(){
		ThreadContext.bind(securityManager);
	}
	
	@Test
	@Rollback(false)
	public void testAdd(){
		User u = new User();
		u.setName("小明");
		u.setEmail("123@qq.com");
		u.setPassword("123456");
		Role role = new Role();
		role.setName("管理员");
		Permission permission = new Permission();
		permission.setName("增加");
		Set<Permission> permissions = new HashSet<Permission>();
		role.setPermissions(permissions);
		Set<Role> roles = new HashSet<Role>();
		roles.add(role);
		
		u.setRoles(roles);
		
		
		userService.save(u);
		//System.out.println(userService.getUser("123@qq.com").getName());
	}
	
	
}
