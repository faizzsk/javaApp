package Assignment_10;

import java.util.Scanner;

class myException extends Exception{
	
	
	public myException() {
		System.out.println("Custom Exception ");
	}
	
	
}
public class Q3 {
	
	

	public static void main(String[] args) {
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter Your Name");
			name = sc.next();

			if(name.length()<3)
			{
				throw new myException();
			}
		}catch(myException m)
		{
			System.out.println(m);
		}
		
		

	}

}
