package com.movieticket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the controller class for the Notification Service
 * 
 * @author Rohith
 *
 */
@RestController
public class NotificationController {

	/**
	 * Method to provied the notification
	 * 
	 * @return String
	 */
	@GetMapping("/notification")
	public String getNotification() {
		return "Payment is successful";
	}
}
