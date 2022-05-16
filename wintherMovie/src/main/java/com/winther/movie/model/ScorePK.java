package com.winther.movie.model;

public class ScorePK {

	private User user;
	private Movie movie;
	
	public ScorePK() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
	
	
}
