package StringClassWork;

import java.util.Scanner;

public class AlternatePrinting {

	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the String");
		
		
		s= sc.next();
		
		
		for(int i = 0 ; i <s.length() ; i+=2)
		{
			char ch = s.charAt(i);
			
			System.out.print(ch);
		}
		
		
		
		
	}

}
