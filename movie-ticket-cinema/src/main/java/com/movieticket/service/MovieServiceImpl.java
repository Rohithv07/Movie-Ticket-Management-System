package com.movieticket.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	@Override
	public MoviesDto listMoviesById(Integer cinemaId) {
		MoviesDto moviesDto = new MoviesDto();
		Optional<Cinema> cinema = movieRepository.findById(cinemaId);
		moviesDto.setCinemaId(cinema.get().getCinemaId());
		moviesDto.setGenre(cinema.get().getGenre());
		moviesDto.setEndTime(cinema.get().getEndTime());
		moviesDto.setStartTime(cinema.get().getStartTime());
		moviesDto.setMovieDirector(cinema.get().getMovieDirector());
		moviesDto.setMovieName(cinema.get().getMovieName());

		return moviesDto;
	}

}
