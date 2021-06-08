package Collection_Weekly_Test2_10_04_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Theatre {

	
	 int Theatreid;
	 String Theatrename;
	 String location;
	 Movie movie;
	 
	 public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTheatreid() {
		return Theatreid;
	}

	public void setTheatreid(int theatreid) {
		Theatreid = theatreid;
	}

	public String getTheatrename() {
		return Theatrename;
	}

	public void setTheatrename(String theatrename) {
		Theatrename = theatrename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
	
	
	 
	





	 public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Theatre(int theatreid, String theatrename, String location, Movie movie) {
		super();
		Theatreid = theatreid;
		Theatrename = theatrename;
		this.location = location;
		this.movie = movie;
	}












	@Override
	public String toString() {
		return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location
				+ ", movie=" + movie + "]";
	}












	class Sort implements Comparator<Theatre>{

		
		public int compare(Theatre o1, Theatre o2) 
		{
			Movie m1 = o1.getMovie();
			Movie m2 = o2.getMovie(); 
		
			if(o1.getMovie().getRating() == o2.getMovie().getRating())
			{
				return o1.getTheatrename().compareToIgnoreCase(o2.getTheatrename());
			}else
			{
				return o2.getMovie().getRating() - o1.getMovie().getRating();
			}
			
		}
	 }
	
	 
 public static void main(String[] args) {
	
	 
	 
	// ArrayList<Movie>  list = new ArrayList<Movie>(2);
	ArrayList<Theatre> t = new ArrayList<Theatre>(2);

	 t.add(new Theatre(1, "AAA", "bbb", new Movie(1, "Zero", 5)));
	 	t.add(new Theatre(1, "KKK", "bbb", new Movie(1, "Zero", 1)));
	 t.add(new Theatre(1, "CCC", "bbb", new Movie(1, "Zero", 2)));
	 	t.add(new Theatre(1, "DDD", "bbb", new Movie(1, "Zero", 6)));
	 t.add(new Theatre(1, "DDD", "bbb", new Movie(1, "Zero", 1)));

	 Collections.sort(t, new Theatre().new Sort());
	 System.out.println(t);
 }
}
