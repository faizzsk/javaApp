package Assignment_7;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		
		int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:"+a.length+" NUmbers");
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for ( int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
