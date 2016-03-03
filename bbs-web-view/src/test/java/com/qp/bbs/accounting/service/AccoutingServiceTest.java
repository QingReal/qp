package com.qp.bbs.accounting.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qp.bbs.accouting.entity.Accounting;
import com.qp.core.base.dao.BaseDao;
import com.qp.core.base.entity.Page;
import com.qp.core.base.service.BaseService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:/config/system/applicationContext.xml","classpath:/config/system/spring-servlet.xml"})  
public class AccoutingServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Resource
	private AccountingService accountingService;
	
	@Test
	public void testAdd(){
		Page page = accountingService.list(new Accounting(), 1, 2);
		System.out.println("总数："+page.getTotalCount());
		System.out.println("总页："+page.getTotalPageCount());
		System.out.println("当前页："+page.getCurrentPageNo());
		List list  = page.getResult();
		for(int i=0;i<list.size();i++){
			System.out.println("list"+i+"："+((Accounting)list.get(i)).getName());
		}
	}
	
	@Test
	public void testUpdate(){
		
	}
	
	@Test
	public void testDelete(){
		Accounting accounting = new Accounting();
		accounting.setName("123");
//		/accountiongService.save(accounting);
	}
	
	
	
	

}
