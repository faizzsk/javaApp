package Assignment_1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {

		
		int p , n ,r;
		double simpleIntrest;
		
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter P");
			p = sc.nextInt();
		
			System.out.println("Enter N");
			n = sc.nextInt();
		
			System.out.println("Enter R");
			r = sc.nextInt();
		
			simpleIntrest = (p*r*n)/100;
		
			System.out.println("Simple Intrest is: "+simpleIntrest);
		
		
		
		
	}

}
