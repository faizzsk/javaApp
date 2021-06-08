package HW16Feb2020;

import java.util.Scanner;

public class MovieMagic {

	int year;
	String title;
	float rating;
	
	
	
	
	public MovieMagic() {
		
		year = 0;
		title = "";
	
	
	}
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year of Release , movie name , rating");
		year = sc.nextInt();
		title=sc.next();
		rating = sc.nextFloat();
	}

	void display()
	{
		System.out.println("Movie"+title);
		System.out.println("Year of Release"+year);
		
		if(rating>=0.0 && rating <= 2.0)
		{
			System.out.println("FLOP");
		}else if(rating >=2.1 && rating <=3.4)
		{
			System.out.println("SEMI HIT");
		}else if(rating >=3.5 && rating <=4.5)
		{
			System.out.println("HIT");
		}else
		{
			System.out.println("SUPER HIT");
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieMagic obj1 = new MovieMagic();
		
		obj1.accept();
		obj1.display();
		
		
	}

}
