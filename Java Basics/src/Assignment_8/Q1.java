package Assignment_8;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		
		int[][] a = new int[2][3];
		
		
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
			for (int j = 0 ; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
