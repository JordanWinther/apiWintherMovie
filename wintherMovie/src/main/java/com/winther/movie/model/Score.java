package com.winther.movie.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Score {
	
	//Chave deve ser instanciada antes de ser populada
	private ScorePK id = new ScorePK();
	private Double value;
	
	
	
	
	
	public Score() {
		
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}
	public void setId(ScorePK id) {
		this.id = id;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	
	
	
	
	
}
