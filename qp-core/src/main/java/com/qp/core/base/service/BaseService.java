package com.qp.core.base.service;


import javax.transaction.Transactional;

import com.qp.core.base.entity.Page;

public interface BaseService<T> {
	@Transactional
	void save(T obj);
	@Transactional
	void update(T obj);
	@Transactional
	Page list(int pageNo,int pageSize);
	@Transactional
	T read(Long id);
	@Transactional
	void delete(T obj);
}
