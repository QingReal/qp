package com.qp.core.message.entity;

public class Message {
	/**
	 * 消息回馈路径
	 */
	private String path;
	
	/**
	 * 附加内容对象
	 */
	private Object obj;
	
	/**
	 * 附加消息内容 
	 */
	private String content;
	
	public Message(){
		
	}
	
	public Message(String path,String content){
		this.path = path;
		this.content = content;
	}
	
	public Message(String path,Object obj){
		this.path = path;
		this.obj = obj;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
