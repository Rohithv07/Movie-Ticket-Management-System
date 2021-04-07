package com.movieticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * This is the spring boot application class for movie ticket catalog service
 * 
 * @author vazha
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MovieTicketCatalogApplication {

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MovieTicketCatalogApplication.class, args);
	}

}
