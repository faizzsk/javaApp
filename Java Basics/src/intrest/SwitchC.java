package intrest;

import java.util.Scanner;

public class SwitchC {

	public static void main(String[] args) {

		
		int a,b;
		int total;
		
		int ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number 1");
		a = sc.nextInt();
		
		System.out.println("Enter Number 2");
		b = sc.nextInt();
	
		
		System.out.println("1. Addition");
		System.out.println("2. Sub");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
	
		
		
		
		System.out.println("Enter Choice");
		ch = sc.nextInt();
		
		
		switch(ch)
		{
			case 1 : System.out.println(a+b);
					 break;
			case 2 : System.out.println(a-b);
					 break;
			case 3 : System.out.println(a*b);
					 break;
			case 4 : System.out.println(a/b);
					 break;
		}
		
		
	}

}
