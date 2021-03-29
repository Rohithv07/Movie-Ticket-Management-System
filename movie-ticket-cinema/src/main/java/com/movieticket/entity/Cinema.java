package com.movieticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CINEMA")
public class Cinema {

	@Id
	@Column(name = "CINEMAID")
	private Integer cinemaId;

	@Column(name = "MOVIENAME" )
	private String movieName;
	
	@Column(name="MOVIEDIRECTOR")
	private String movieDirector;
	
	@Column(name = "GENRE" )
	private String genre;
	
	@Column(name = "STARTTIME" )
	private String startTime;
	
	@Column(name = "ENDTIME")
	private String endTime;

	public Integer getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Cinema(int cinemaId, String movieName, String movieDirector, String genre, String startTime,
			String endTime) {
		super();
		this.cinemaId = cinemaId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.genre = genre;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Cinema() {
		
	}

	@Override
	public String toString() {
		return "Cinema [cinemaId=" + cinemaId + ", movieName=" + movieName + ", movieDirector=" + movieDirector
				+ ", genre=" + genre + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	

	
}
