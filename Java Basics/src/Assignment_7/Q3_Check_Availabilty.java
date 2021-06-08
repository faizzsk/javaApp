package Assignment_7;

import java.util.Scanner;

public class Q3_Check_Availabilty {

	public static void main(String[] args) {

		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:"+a.length+" NUmbers");
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter number to check avalabilty");
	
		int num = sc.nextInt();
		
		for ( int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == num)
			{
				System.out.println(a[i]+" Present at index: "+i);
			}
		}
		

		
		
		
		
		
	}

}
