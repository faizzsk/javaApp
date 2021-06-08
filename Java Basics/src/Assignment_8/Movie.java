package Assignment_8;

public class Movie {
	
	int mid;
	String mname;
	int rating;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Movie(int mid, String mname, int rating) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.rating = rating;
	}




	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}




	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", rating=" + rating + "]";
	}
	
	
	

}
