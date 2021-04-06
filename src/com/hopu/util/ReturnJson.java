package com.hopu.util;

public class ReturnJson {
	/**
	 * 200:成功
	 * 404：值为空
	 * 500：报异常
	 * 600：失败
	 */
	private Integer code;
	
	private String message;
	
	private Object date;

	public ReturnJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReturnJson(Integer code, String message, Object date) {
		super();
		this.code = code;
		this.message = message;
		this.date = date;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getDate() {
		return date;
	}

	public void setDate(Object date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ReturnJson [code=" + code + ", message=" + message + ", date=" + date + "]";
	}
	
	
	
	
	
}
