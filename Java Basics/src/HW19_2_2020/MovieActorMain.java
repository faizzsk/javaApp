package HW19_2_2020;

import java.util.Scanner;

public class MovieActorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Actor Name And gender");
		Actor a = new Actor(sc.next(),sc.next().charAt(0));
		System.out.println("Enter Movie ID, Name ");
		Movie m = new Movie(sc.nextInt(), sc.next(), a);
		
		
		m.display();
		
		
		
		
		
		
	}

}
