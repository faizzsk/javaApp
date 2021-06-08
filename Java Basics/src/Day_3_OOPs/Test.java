package Day_3_OOPs;

public class Test {

	public static void main(String[] args) {

		
		OopsDemo o1 = new OopsDemo();
		System.out.println("Call of deafult constructor");
		o1.display();
		OopsDemo o2 = new OopsDemo("Jab tak hai jaan", 2012, "Shah Rukh Khan");
		//System.out.println();
		System.out.println("Call for parametrized constructor");
		o2.display();
		
		OopsDemo o3 = new OopsDemo();
		
		o3.movieName = "CHichore";
		o3.actor = "Sushant Singh";
		o3.releaseYear = 2018;
		System.out.println("----");
		o3.display();
		
		OopsDemo o4 = new OopsDemo();
		o4.setMovieName("3 Idiots");
		o4.setActor("Amir");
		o4.setReleaseYear(2015);
		System.out.println("Call by setter and gettter");
		System.out.println(o4.getActor());
		System.out.println(o4.getMovieName());
		System.out.println(o4.getReleaseYear());
		
	}

}
