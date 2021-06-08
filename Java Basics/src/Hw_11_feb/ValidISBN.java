package Hw_11_feb;

import java.util.Scanner;

public class ValidISBN {

	public static void main(String[] args) {

		
		long num;
		
		System.out.println("Enter 10 Digit Number");
		Scanner sc = new Scanner(System.in);

		num = sc.nextLong();
		long n = num;
		long sum=0;
		int cnt=0;
		while(num>0)
		{
			cnt++;
			num = num/10;
		}
		System.out.println(cnt);

		if(cnt==10)
		{
		//	System.out.println("In");
			int i = 1;
				while(n>0)
				{
					long r = n % 10;
					sum = sum + (r * i);
					i++;
					n = n/10;
				}
			
		if(sum % 11==0)
		{
			System.out.println("Valid ISBN");
		}
		else
		{
			System.out.println("Invalid ISBN");
		}
		
	}

	}
}
