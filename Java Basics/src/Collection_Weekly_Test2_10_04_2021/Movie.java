package Collection_Weekly_Test2_10_04_2021;

public class Movie {
	int Movieid;
	String Moviename;
	int Rating;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieid, String moviename, int rating) {
		super();
		Movieid = movieid;
		Moviename = moviename;
		Rating = rating;
	}
	public int getMovieid() {
		return Movieid;
	}
	public void setMovieid(int movieid) {
		Movieid = movieid;
	}
	public String getMoviename() {
		return Moviename;
	}
	public void setMoviename(String moviename) {
		Moviename = moviename;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [Movieid=" + Movieid + ", Moviename=" + Moviename + ", Rating=" + Rating + "]";
	}
	
	
}
