package com.movieticket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticket.dao.MovieRepositoryLocal;
import com.movieticket.dto.MoviesDto;
import com.movieticket.entity.Cinema;

/**
 * 
 * @author Priya.Prasad
 *
 */
@Service
public class MovieServiceImpl implements MovieServiceLocal {

	@Autowired
	MovieRepositoryLocal movieRepository;
	
	@Override
	public List<MoviesDto> getAllMovies() {
		List<MoviesDto> listMovies = new ArrayList<>();
		MoviesDto moviesDto = new MoviesDto();
		List<Cinema> cinemas = movieRepository.findAll();
		for (Cinema cinema : cinemas) {
			moviesDto.setCinemaId(cinema.getCinemaId());
			moviesDto.setGenre(cinema.getGenre());
			moviesDto.setEndTime(cinema.getEndTime());
			moviesDto.setStartTime(cinema.getStartTime());
			moviesDto.setMovieDirector(cinema.getMovieDirector());
			moviesDto.setMovieName(cinema.getMovieName());
			listMovies.add(moviesDto);
		}
		return listMovies;
	}

}
