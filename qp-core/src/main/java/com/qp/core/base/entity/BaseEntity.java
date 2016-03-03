package com.qp.core.base.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 实体主键id
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * 创建日期
	 */
	@Column
	private Date createDate;
	
	/**
	 * 创建时间
	 */
	@Column
	private Date createTime;
	
	/**
	 * 修改日期
	 */
	@Column
	private Date modifyDate;
	
	/**
	 * 修改时间
	 */
	@Column
	private Date modifyTime;
	
	/**
	 * 状态
	 */
	@Column
	private boolean state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
	
	
}
