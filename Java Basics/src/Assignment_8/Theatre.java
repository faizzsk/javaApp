package Assignment_8;

import java.util.Arrays;

public class Theatre {
	
	int tid;
	String name;
	String location;
	Movie movie[];
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theatre(int tid, String name, String location, Movie[] movie) {
		super();
		this.tid = tid;
		this.name = name;
		this.location = location;
		this.movie = movie;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Movie[] getMovie() {
		return movie;
	}
	public void setMovie(Movie[] movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Theatre [tid=" + tid + ", name=" + name + ", location=" + location + ", movie=" + Arrays.toString(movie)
				+ "]";
	}
	
	
	

}
