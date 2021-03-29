package com.movieticket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticket.entity.Cinema;

public interface MovieRepositoryLocal extends JpaRepository<Cinema, Integer> {
	
}

