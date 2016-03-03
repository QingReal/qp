package com.qp.core.user.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Title: qp-user实体类
 * @author Qing
 */
@Entity
@Table(name = "qp_user")
public class User implements Serializable{


	/**
	 * 
	 */
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String sex;
	
	private int locked;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
}
