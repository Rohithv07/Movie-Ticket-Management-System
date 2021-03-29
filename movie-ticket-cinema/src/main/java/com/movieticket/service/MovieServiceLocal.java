package com.movieticket.service;

import java.util.List;

import com.movieticket.dto.MoviesDto;
import com.movieticket.entity.Cinema;

public interface MovieServiceLocal {
	
	public List<Cinema> getAllMovies(); 
}
