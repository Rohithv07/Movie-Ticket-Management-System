package com.movieticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieTicketCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketCinemaApplication.class, args);
	}

}
