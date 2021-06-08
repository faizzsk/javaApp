package Assignment_7;

import java.util.Scanner;

public class Q2_Alternate {

	public static void main(String[] args) {

		int a[] = new int[6];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:"+a.length+" NUmbers");
		
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for ( int i = 0 ; i < a.length ; i=i+2)
		{
			System.out.println(a[i]);
		}
		

		
		
		
		
	}

}
