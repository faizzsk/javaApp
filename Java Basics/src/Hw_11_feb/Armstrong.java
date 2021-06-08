package Hw_11_feb;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int a = num;
		int b =a;
		int c = 0;
		double sum=0;
		while(num >0)
		{
			c++;
			num = num/10;
		}
		
		while(a>0)
		{
			int r = a % 10;
			sum = sum +(Math.pow(r, c));
			a = a/10;
			
		}
		System.out.println(sum);
		
		if(sum == a )
		{
			System.out.println("Armstrong Number");
		}else
		{
			System.out.println("No....");
		}
	}

}
