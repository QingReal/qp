package com.qp.bbs.accounting.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.qp.bbs.accouting.entity.Accounting;

@Repository
public class AccountingDao {
	
	@Resource
	public SessionFactory factory;
	
	public Session getSession(){
		return factory.openSession();
	}
	
	public void add(Accounting accounting){
		getSession().save(accounting);
		getSession().close();
	}
	
}
