package Assignment_10;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		
		try 
		{
			num = sc.nextInt();
			FileReader fin = new FileReader("abc.text");// this is checked exception

			int c= 8/0;// this is unchekd exception
		}
		catch(ArithmeticException a) 
		{
			System.out.println(a);
			a.getStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			e.getStackTrace();
		}

	}

}
