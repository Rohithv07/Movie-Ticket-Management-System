package com.movieticket.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.movieticket.dto.ResponseMessage;

/**
 * This is a FeignClient interface used to communicate with the movie service
 * 
 * @author vazha
 *
 */
@FeignClient(name = "movie", url = "http://localhost:8082/movieTicketCinema")
public interface MovieFeignClient {

	/**
	 * Details from the Movie service is received for the end point /listAllMovies
	 * 
	 * @return list of all movies
	 * @see ResponseMessage
	 */
	@GetMapping("/listAllMovies")
	public ResponseMessage listAllMovies();

	/**
	 * Details from the Movie service for the end point /listMoviesById/{cinemaId}
	 * 
	 * @param cinemaId
	 * @return List of all movies by id
	 * @see ResponseMessage
	 */
	@GetMapping("/listMoviesById/{cinemaId}")
	public ResponseMessage listMoviesById(@PathVariable Integer cinemaId);
}
