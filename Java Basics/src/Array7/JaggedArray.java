package Array7;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {

		
		
		int[][] a = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <a.length; i++)
		{
			System.out.println("Enter column size for row"+i);
			int col = sc.nextInt();
			
			a[i] = new int[col];
		}
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter number for column");
			for(int j = 0 ; j<a[i].length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < a.length ; i++)
		{
			//System.out.println("enter number for column");
			for(int j = 0 ; j<a[i].length; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
