package com.movieticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  MovieTicketNotificationApplication application class with the main method
 * @author Rohith
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MovieTicketNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketNotificationApplication.class, args);
	}

}
