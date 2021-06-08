package Array_Weekly_Test_4_6_March;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		
		
		int r =3;
		int c =3;
		
		int [][] a = new int[r][c];
		for(int i = 0 ; i < a.length ; i++)
		{
			for (int j = 0 ; j < a[i].length ; j++)
			{
				
				a[i][j]= sc.nextInt();
				
			}
		}
		
		
		
		for(int i = 0 ; i < c; i++)
		{
			int max =a[i][i];
			for(int j = 0 ; j <r;j++)
			{
				if(a[j][i]>max)
				{
					max = a[j][i];
				}
				
			}
			System.out.println("Column "+i+" min");
			System.out.println(max);

		
		
		
	}

	}}
