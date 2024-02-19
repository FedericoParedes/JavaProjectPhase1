package model.domain;

import java.util.List;

public class MoviesList {
	
	public int id;
	
	public List<Movie> movies;
	
	public MoviesList() {
		// TODO Auto-generated constructor stub
	}

	public MoviesList(List<Movie> movies) {
		super();
		this.movies = movies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	

}
