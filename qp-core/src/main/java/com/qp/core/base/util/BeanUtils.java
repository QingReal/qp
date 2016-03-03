package com.qp.core.base.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

public class BeanUtils {
	
	
	public static List<SimpleExpression> generatorFilter(Object obj) throws IllegalArgumentException, IllegalAccessException{
		
		Field fields[] = obj.getClass().getDeclaredFields();//获得对象所有属性
	    Field field=null;
	    List<SimpleExpression> filters = new ArrayList<SimpleExpression>();
		for (int i = 0; i < fields.length; i++) {
			field=fields[i];
		    field.setAccessible(true);//修改访问权限
<<<<<<< HEAD
		    
		    String name = field.getName();//获取属性的名字
		    String val = field.get(obj) + " ";
		    
		    
		    if(val != null && !"".equals(val.trim())&& !"0".equals(val.trim())){
		    	
=======
		    String name = field.getName();//获取属性的名字
		    String val = (String)field.get(obj);
		    if(val != null && !"".equals(val)){
>>>>>>> branch 'master' of https://github.com/QingReal/qp.git
		    	SimpleExpression simpleExpression = Restrictions.eq(name, val);
		    	filters.add(simpleExpression);
		    }
		}
		return filters;
	}
}
