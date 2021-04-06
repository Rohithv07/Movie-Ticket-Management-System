package com.movieticket.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.movieticket.dto.ResponseMessage;

@FeignClient(name = "movie", url = "http://localhost:8082/movieTicketCinema")
public interface MovieFeignClient {
	@GetMapping("/listAllMovies")
	public ResponseMessage listAllMovies();
	
	@GetMapping("/listMoviesById{cinemaId}")
	public ResponseMessage listMoviesById(@PathVariable Integer cinemaId);
}
