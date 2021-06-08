package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		
		int a ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		
		try {
			a = sc.nextInt();

		
				System.out.println("a :"+a);
				System.out.println("square :"+a*a);
				System.out.println("divison :"+a/0);
			
			
			}catch (InputMismatchException ie)
			{
				System.out.println(ie);
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
		
			catch(Exception e) 
			{
				System.out.println(e);
			}
		
	}

}
