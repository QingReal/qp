package com.qp.bbs.accounting.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.Resource;

import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qp.bbs.accouting.entity.Accounting;
import com.qp.core.base.dao.BaseDao;
import com.qp.core.base.entity.Page;
import com.qp.core.base.service.BaseService;
import com.qp.core.base.service.impl.BaseServiceImpl;
import com.qp.core.base.util.BeanUtils;

@Transactional
@Service
public interface AccountingService extends BaseService<Accounting>{
	
}
