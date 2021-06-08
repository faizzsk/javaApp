package Assignment_8;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		
		
		
		int [][] a = new int[2][3];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for (int j = 0 ; j < a[i].length ; j++)
			{
				
				a[i][j]= sc.nextInt();
				
			}
		}

		
		
		for(int i = 0 ; i < 3 ; i++)
		{
			int min =a[0][i];

			for(int j = 0 ; j < 2;j++)
			{

				if(a[j][i]<min)
				{
					min = a[j][i];
				}
				
			}
			System.out.println("Column "+i+" min");
			System.out.println(min);

		
		
		
	}

	}}
