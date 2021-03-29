package com.movieticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movieticket.dto.ResponseMessage;
import com.movieticket.service.MovieServiceLocal;

@RestController
public class MovieController {
	
	@Autowired
	MovieServiceLocal movieService;
	
	@RequestMapping(value = "/listAllMovies", method = RequestMethod.GET)
	public ResponseMessage listAllMovies() {
		ResponseMessage resp=new ResponseMessage();
		resp.setData(movieService.getAllMovies());
		return resp;
	}
}
	
