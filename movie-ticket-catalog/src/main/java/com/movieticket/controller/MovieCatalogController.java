package com.movieticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieticket.dto.ResponseMessage;
import com.movieticket.proxy.MovieFeignClient;

@RestController
@RequestMapping("/movieCatalog")
public class MovieCatalogController {
	@Autowired
	private MovieFeignClient movieFeignClient;

	@GetMapping("/getCatalog")
	public ResponseMessage getCatalog() {
		return movieFeignClient.listAllMovies();
	}

	@GetMapping("/getCatalog/{id}")
	public ResponseMessage getCatalogById(@PathVariable Integer id) {
		return movieFeignClient.listMoviesById(id);
	}
}
