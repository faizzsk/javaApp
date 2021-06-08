package HW19_2_2020;

public class Movie {

	
	
	private int movieId;
	private String movieName;
	Actor actor;
	
	public Movie() {
		
	}

	public Movie(int movieId, String movieName, Actor actor) {
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

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	public void display()
	{
		System.out.println("Movie Name"+movieName);
		System.out.println("Movie Actor"+actor.getName());
		System.out.println("Gender"+actor.getGender());
	}
	
}
