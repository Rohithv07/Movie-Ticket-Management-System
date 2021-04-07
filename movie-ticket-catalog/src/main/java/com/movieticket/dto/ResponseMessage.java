package com.movieticket.dto;

/**
 * This is the response message class used to give the output
 * 
 * @author vazha
 *
 */
public class ResponseMessage {

	/**
	 * This field stores data of type Object
	 */
	private Object data;
	/**
	 * This field stores the value of status code as String
	 */
	private String statusCode;
	/**
	 * This field stores the message as String
	 */
	private String message;

	/**
	 * Getters and setters of the field
	 * 
	 */
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
