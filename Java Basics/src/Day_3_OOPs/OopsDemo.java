package Day_3_OOPs;

public class OopsDemo {
	
	
	String movieName;
	int releaseYear;
	String actor;
	
	
	
	OopsDemo()
	{
		
	}
	
	
	OopsDemo(String movieName , int releaseYear , String actor)
	{
		this.movieName   = movieName;
		this.releaseYear = releaseYear;
		this.actor		 = actor;
	}
	
	
	public String getMovieName()
	{
		return movieName;
	}
	
	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}
	
	public String getActor()
	{
		return actor;
	}
	
	public void setActor(String actor)
	{
		this.actor = actor;
	}
	
	public int getReleaseYear()
	{
		return releaseYear;
	}
	
	public void setReleaseYear(int releaseYear)
	{
		this.releaseYear = releaseYear;
	}
	
	
	public void display()
	{
		System.out.println("Movie :"+movieName);
		System.out.println("Actor :"+actor);
		System.out.println("Realease Year :"+releaseYear);
	}
}
