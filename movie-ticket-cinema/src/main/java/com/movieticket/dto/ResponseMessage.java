package com.movieticket.dto;

public class ResponseMessage {

	private Object data;
	private String statusCode;
	private String message;

	/**
	 * 
	 * @return Object
	 */
	public Object getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 
	 * @return String
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * 
	 * @param statusCode
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * 
	 * @return String
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
