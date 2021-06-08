package Assignment_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		
		
		Scanner  sc = new Scanner(System.in);
		int num ;
		
		try
		{
			System.out.println("Enter number");
			num = sc.nextInt();
			System.out.println("The number is :"+num);
			System.out.println("divison :"+num/0);
		}catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Hello...");
		}		
		
		
		
		
	}

}
