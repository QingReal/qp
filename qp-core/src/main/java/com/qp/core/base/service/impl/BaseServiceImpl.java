package com.qp.core.base.service.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.SimpleExpression;
import org.springframework.transaction.annotation.Transactional;

import com.qp.core.base.dao.BaseDao;
import com.qp.core.base.entity.Page;
import com.qp.core.base.service.BaseService;
import com.qp.core.base.util.BeanUtils;

public class BaseServiceImpl<T> implements BaseService<T> {
	
	
	@Resource 
	private BaseDao<T> dao;  
	private Class<T> clazz;
	
	public BaseServiceImpl(){
		// 子类
        Class cla = getClass();
        // 通过子类获取到父类 
        // 泛型参数
        Type type = cla.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) type;
            clazz = (Class<T>) pType.getActualTypeArguments()[0];
        }
	}
	
	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}

	public void save(T obj){
		dao.save(obj);
	}
	
    @Transactional(rollbackFor={Exception.class})
	public void update(T obj){
		dao.update(obj);
	}
    @Transactional(readOnly=true)
	public T read(Long id){
		return dao.read(id,clazz);
	}
    
    @Transactional(readOnly=true)
	public List<T> read(SimpleExpression filter){
		return dao.read(clazz, filter);
	}
    
    @Transactional(readOnly=true)
	public List<T> read(List<SimpleExpression> filters){
		return dao.read(clazz,filters);
	}
    
    @Transactional(rollbackFor={Exception.class})
	public void delete(T obj){
		dao.delete(obj);
	}
    
    @Transactional(rollbackFor={Exception.class})
	public Page list(int pageNo,int pageSize){
		return dao.list(clazz, pageNo, pageSize,null);
	}

	public BaseDao<T> getDao() {
		return dao;
	}

    
}
