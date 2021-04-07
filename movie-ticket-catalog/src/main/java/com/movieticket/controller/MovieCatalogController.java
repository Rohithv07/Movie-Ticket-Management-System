package com.movieticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieticket.dto.ResponseMessage;
import com.movieticket.proxy.MovieFeignClient;

/**
 * This is the controller for the movie catalog service
 * 
 * @author vazha
 *
 */
@RestController
@RequestMapping("/movieCatalog")
public class MovieCatalogController {
	/**
	 * This is the feign client which is used to communicate with the movie service
	 */
	@Autowired
	private MovieFeignClient movieFeignClient;

	/**
	 * Retrieve the movie catalog
	 * 
	 * @return list of all movies
	 * @see ResponseMessage
	 */
	@GetMapping("/getCatalog")
	public ResponseMessage getCatalog() {
		return movieFeignClient.listAllMovies();
	}

	/**
	 * Retrieve the catalog based on id
	 * 
	 * @param id
	 * @return movie details based on id
	 * @see ResponseMessage
	 */
	@GetMapping("/getCatalogById/{id}")
	public ResponseMessage getCatalogById(@PathVariable Integer id) {
		return movieFeignClient.listMoviesById(id);
	}
}