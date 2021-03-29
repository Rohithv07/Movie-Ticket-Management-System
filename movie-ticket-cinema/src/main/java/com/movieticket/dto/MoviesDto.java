package com.movieticket.dto;

public class MoviesDto {

	private int cinemaId;
	private String movieName;
	private String movieDirector;
	private String genre;
	private String startTime;
	private String endTime;

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
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

	public MoviesDto(int cinemaId, String movieName, String movieDirector, String genre, String startTime,
			String endTime) {
		this.cinemaId = cinemaId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.genre = genre;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public MoviesDto() {
	}

	@Override
	public String toString() {
		return "MoviesDto [cinemaId=" + cinemaId + ", movieName=" + movieName + ", movieDirector=" + movieDirector
				+ ", genre=" + genre + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
