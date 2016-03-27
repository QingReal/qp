package com.qp.core.base.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qp.core.base.dao.BaseDao;
import com.qp.core.base.entity.Page;

@Repository
public class BaseDao <T>{
	
	@Resource
	public SessionFactory sessionFactory;
	
	/**
	 * 数据操作会话
	 * @return
	 */
	public Session getSession() {
		// 事务必须是开启的(Required)，否则获取不到
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * 新增
	 */
	public void save(T obj) {
		getSession().save(obj);
	}

	/**
	 * 查询
	 */
	public T read(Serializable id,Class<T> type) {
		return (T)getSession().get(type, id);
	}
	
	/**
	 * 更新
	 */
	public void update(T obj) {
		getSession().update(obj);
	}

	/**
	 * 删除
	 */
	public void delete(T obj) {
		getSession().delete(obj);
	}
	
	/**
	 * 多条件查询
	 * @param obj
	 * @param filters
	 * @return
	 */
	public List<T> read(Class<T> type,List<SimpleExpression> filters){
		Criteria criteria = getSession().createCriteria(type);
		if(filters != null){
			for (SimpleExpression filter : filters) {
				criteria.add(filter);
			}
		}	
		return criteria.list();
	}
	
	/**
	 * 单条件查询
	 * @param obj
	 * @param filters
	 * @return
	 */
	public List<T> read(Class<T> type,SimpleExpression filter){
		Criteria criteria = getSession().createCriteria(type);
		if(filter != null){
			criteria.add(filter);
		}	
		return criteria.list();
	}
	
	/**
	 * 分页列表
	 */
	@Transactional
	public Page list(Class<T> type, int pageNo, int pageSize,List<SimpleExpression> filters) {
		
		Criteria criteria = getSession().createCriteria(type);		
		// 查询初始下标
		int start = Page.getStartOfPage(pageNo, pageSize);
		// 设置起始结果数
		criteria.setFirstResult(start);
		// 返回的最大结果集
		criteria.setMaxResults(pageSize);
		// 查询条件遍历
		if(filters != null){
			for (SimpleExpression filter : filters) {
				criteria.add(filter);
			}
		}
		// 查询数据集合
		List<T> list = criteria.list();
		// 查询数据总数
		long totalCount = getCount(type);
		
		return new Page(start,totalCount,pageSize,list);
	}
	/**
	 * 结果集总数
	 */
	public Long getCount(Class<T> type){
		Criteria criteria = getSession().createCriteria(type);		
		return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
	}

}
