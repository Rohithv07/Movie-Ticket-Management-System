package com.movieticket.service;

import java.util.List;

import com.movieticket.dto.MoviesDto;

public interface MovieServiceLocal {
	
	public List<MoviesDto> getAllMovies();

	public MoviesDto listMoviesById(Integer cinemaId); 
}
