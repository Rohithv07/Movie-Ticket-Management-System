package com.movieticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieticket.dto.ResponseMessage;
import com.movieticket.service.MovieServiceLocal;

@RestController
@RequestMapping(value="/movieTicketCinema")
public class MovieController {
	
	@Autowired
	MovieServiceLocal movieService;
	
	@GetMapping("/listAllMovies")
	public ResponseMessage listAllMovies() {
		ResponseMessage resp=new ResponseMessage();
		resp.setData(movieService.getAllMovies());
		return resp;
	}
	
	@GetMapping("/listMoviesById/{cinemaId}")
	public ResponseMessage listMoviesById(@PathVariable Integer cinemaId) {
		ResponseMessage resp=new ResponseMessage();
		resp.setData(movieService.listMoviesById(cinemaId));
		return resp;
	}
	
	
}
	
