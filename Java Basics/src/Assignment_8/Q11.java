package Assignment_8;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) 
	
	{

		int[][] a = new int[2][3];
		int[][] b = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < a.length; i++)
		{
			System.out.println("Enter data at row"+i);
			
			for (int j = 0 ; j<a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
			
		}
		
		
		for(int i = 0 ; i < a.length; i++)
		{
			for (int j = a[i].length-1 ; j>=0;j--)
			{
				b[i][j]=a[i][j];
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		/*
		for(int i = 0 ; i < a.length; i++)
		{
			for (int j = 0 ; j<a.length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}*/
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
