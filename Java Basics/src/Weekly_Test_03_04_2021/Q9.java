package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Movie{
	
	int movieId;
	String movieName;
	List<String> actor;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String movieName, List<String> actor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public List<String> getActor() {
		return actor;
	}
	public void setActor(List<String> actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + "]";
	}
		
	
	
	
	
}
public class Q9 {

	public static void main(String[] args) {
		
		Movie [] m = new Movie[3];
		ArrayList<Movie> al = new ArrayList<Movie>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i < m.length ; i++)//yaha se
		{
			System.out.println("movie id , movie name");
			m[i]=new Movie();
			m[i].setMovieId(sc.nextInt());
			m[i].setMovieName(sc.next());
			
			List<String> actor = new ArrayList<String>(2);
			System.out.println("Enter Two Actors");
			actor.add(sc.next());
			actor.add(sc.next());
	 		
			m[i].setActor(actor);
			
			al.add(m[i]);
		}
		
		System.out.println(al);
		
		
		Iterator<Movie> itr = al.iterator();
		int cnt=0;
		for(int i = 0 ; i < al.size() ; i++)
		{
			
			Movie temp = al.get(i);
			for(int j = 0 ; j < 2 ; j++)
			{
				if(temp.getActor().get(j).equalsIgnoreCase("AB"))
				{
					System.out.println(temp);
					cnt++;
					break;
				}
			}
			
		}
		
		System.out.println(cnt);
		
		
		
		
		
		
	}
}
