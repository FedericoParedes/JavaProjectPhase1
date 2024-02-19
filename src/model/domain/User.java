package model.domain;

public class User {
	
	
	public int id;
	
	public String username;
	
	public String email;
	
	public String password;
	
	public MoviesList movies;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, String password, MoviesList movies) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.movies = movies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MoviesList getMovies() {
		return movies;
	}

	public void setMovies(MoviesList movies) {
		this.movies = movies;
	}
	
	
	
	
	
	
	

}
