package ArrayTest_4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		int a[] = new int[5];
		
		System.out.println("---Enter array------   ");
		for(int i = 0 ; i <a.length ; i++)
		{
			
			
			a[i] = sc.nextInt();
			
			
		}
		int sum;
		System.out.println("enter sum");
		sum = sc.nextInt();
		
		
		
		for(int i = 0 ; i < a.length ; i++)
		{
			
			for (int j = i+1 ; j < a.length ; j++)
			{
				if(sum == a[i]+a[j] )
				{
					System.out.println("["+a[i]+","+a[j]+"]");
				}
			}

			
		}
		
		
		
		
		
		
		
	}

}
