package intrest;

import java.util.Scanner;

public class Pattern6b {

	public static void main(String[] args) {

		
		int rows;
		System.out.println("Enter Number of Rows");
		Scanner sc =new Scanner(System.in);
		
		rows = sc.nextInt();
		int space = rows-1;
		for (int i = 1 ; i <= rows*2 ; i=i+2)
		{
			for(int j = 1 ; j <= space ; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
		}
		
		
		int p = 1;
		for (int i = rows*2-3 ; i >=1 ;i= i-2)
		{
			for(int j = 1 ; j <=p  ; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1 ; k<=i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			p++;
		}
		
	}

}
