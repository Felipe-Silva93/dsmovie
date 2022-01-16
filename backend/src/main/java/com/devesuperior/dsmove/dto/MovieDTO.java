package com.devesuperior.dsmove.dto;

import com.devesuperior.dsmove.entities.Movie;

public class MovieDTO {
	
	private Long id;
	private String title;
	private Double score;
	private String count;
	private String image;
	
	public MovieDTO() {
		
	}

	public MovieDTO(Long id, String title, Double score, String count, String image) {

		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MovieDTO(Movie movie) {

		id = movie.getId();
	    title =movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
