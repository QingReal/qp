package com.qp.bbs.accounting.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qp.bbs.accouting.entity.Accounting;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:/config/system/applicationContext.xml","classpath:/config/system/spring-servlet.xml"})  
public class AccoutingServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Resource
	private AccoutingService service;
	
	@Test
	public void testAdd(){
		Accounting accounting = new Accounting();
		accounting.setName("123");
		service.save(accounting);
	}

}
