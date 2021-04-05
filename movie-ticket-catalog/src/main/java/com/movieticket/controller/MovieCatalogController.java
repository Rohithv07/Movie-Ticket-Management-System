package com.movieticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieticket.dto.ResponseMessage;
import com.movieticket.proxy.MovieFeignClient;

@RestController
public class MovieCatalogController {
	@Autowired
	private MovieFeignClient movieFeignClient;

	@GetMapping("/getcatalog")
	public ResponseMessage getCatalog() {

		return movieFeignClient.listAllMovies();
	}
}
