package Assignment_7;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:"+a.length+" NUmbers");
		
		for(int i = a.length-1 ; i>=0;i--)
		{
			a[i] = sc.nextInt();
		}
		
		for ( int i = a.length-1 ; i >=0 ; i--)
		{
			
			b[i] = a[i];
		}
		
		for(int i =0 ; i<a.length;i++)
		{
			System.out.print(b[i]);
		}

		
		
		
		
		
		
		
		
	}

}
