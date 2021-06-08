package Assignment_9;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {

		
		String userName;
		String passWord;
		
		Scanner sc = new Scanner(System.in);
		//userName = sc.next();
		System.out.println("Enter password");

		passWord=sc.next();
		String pat="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8}$";


		
		if(passWord.matches(".*[0-9]{1,}.*")  && passWord.matches(".*[@#]{1,}.*") && passWord.matches(".*[A-Z]{1,}.*") &&passWord.matches(".*[a-z]{1,}.*") && passWord.length()==8)		
		
		{
				System.out.println("Valid");
		}
		else
		{
				System.out.println("not valid");
		}
		
	
	}

}
