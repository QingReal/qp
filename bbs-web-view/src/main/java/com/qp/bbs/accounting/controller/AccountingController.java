package com.qp.bbs.accounting.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qp.bbs.accounting.service.AccountingService;
import com.qp.bbs.accouting.entity.Accounting;


@Controller
@RequestMapping("/accounting")
public class AccountingController {
	
	@Resource(name="accountingServiceImpl")
	private AccountingService accountiongService;
	
	@RequestMapping(value="/hello")
	public String test1(){
		Accounting accounting = new Accounting();
		accountiongService.list(accounting, 1, 2);;
		//accounting.setName("444");
		//accountiongService.update(accounting);
		//accountiongService.delete(accounting);
		return "index";
	}
	
}
