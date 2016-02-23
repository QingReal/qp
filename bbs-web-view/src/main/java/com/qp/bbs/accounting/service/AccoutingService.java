package com.qp.bbs.accounting.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qp.bbs.accounting.dao.AccountingDao;
import com.qp.bbs.accouting.entity.Accounting;

@Service
public class AccoutingService {
	
	@Resource
	private AccountingDao dao;
	
	public void save(Accounting accounting){
		dao.add(accounting);
	}
	
}
