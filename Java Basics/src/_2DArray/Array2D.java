package _2DArray;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		
		
		int [][] a = new int[2][3];
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i<a.length;i++)
		{
			System.out.println("Enter data for row :"+i);
			for(int j = 0 ; j < a[i].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("col"+a[0].length);
		
		int max_row=a[0][0];

		for(int i = 0 ; i<a.length;i++)
		{
			
			for(int j = 0 ; j < a[i].length;j++)
			{ 	
				if(max_row < a[i][j])
			{
				max_row= a[i][j];

			}

			}
			
			
			System.out.println();
	}
		System.out.print("max =   "+max_row+" ");

	
		
		
		
		for(int []t:a)
		{
			for(int data:t)
			{
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
