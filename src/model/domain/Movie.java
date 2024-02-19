package model.domain;

import java.io.File;

public class Movie {

	
	public int code;
	
	public String title;
	
	public String url;
	
	public File image;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String url, File image) {
		super();
		this.title = title;
		this.url = url;
		this.image = image;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}
	
	
	
	
	
	
	
	
	
	
	
}
