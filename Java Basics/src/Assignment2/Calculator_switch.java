package Assignment2;

import java.util.Scanner;

public class Calculator_switch {

	public static void main(String[] args) {

		
		int a,b;
		int ch;
		System.out.println("Enter a and b");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
	    System.out.print("Enter What u want to do...1.add......2.sub.....3.mult...4.div");

		ch = sc.nextInt();
		
		switch(ch)
		{
			
		case 1 : System.out.println("Addition is :"+(a+b));
				 break;
		case 2 : System.out.println("Substration is :"+(a-b));
				 break;
		case 3 : System.out.println("Multiplication is : "+ (a*b));
				 break;
		case 4 : System.out.println("Division is :"+(a/b));
				 break;
		}
		
		
		
	}

}
