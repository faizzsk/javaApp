package Assignment2;

import java.util.Scanner;

public class Day_of_the_week {

	public static void main(String[] args) {

		
		
		int day ;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter NUmber of day");
		day = sc.nextInt();
		
		if(day >=1 && day <= 7)
		{
		if(day==1)
			System. out. println ("Day is Monday ") ;
		else if(day==2)
			System. out. println(" Day is Tuesday ") ;
		else if(day==3)
			System. out. println (" Day is Wednesday ") ;
		else if(day==4)
			System. out. println ("Day is Thursday ") ;
		else if (day==5)
			System. out. println (" Day is Friday ") ;
		else if (day==6)
			System. out. println (" Day is Saturday ") ;
		else
			System. out. println (" Day is Sunday ") ;
		}
		else
			System. out. println (" Wrong number entered ") ;
		
	
		
		
		
		
		
	}

}
