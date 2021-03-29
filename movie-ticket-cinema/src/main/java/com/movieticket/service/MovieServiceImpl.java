package com.movieticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticket.dao.MovieRepositoryLocal;
import com.movieticket.dto.MoviesDto;
import com.movieticket.entity.Cinema;

@Service
public class MovieServiceImpl implements MovieServiceLocal {
	
	@Autowired
	MovieRepositoryLocal movieRepository;

	@Override
	public List<Cinema> getAllMovies() {
		return movieRepository.findAll();
	}

}
