package Assignment_7;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		
	int a[] = new int[5];
		int sum = 0;
		int product =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:"+a.length+" NUmbers");
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for ( int i = 0 ; i < a.length ; i++)
		{
			sum = sum + a[i];
			product = product * a[i];
			
		//	System.out.println(a[i]);
		}
	
		System.out.println("Sum :"+sum);
		System.out.println("Product :"+product);
	}

}
