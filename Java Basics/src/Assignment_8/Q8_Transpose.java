package Assignment_8;

import java.util.Scanner;

public class Q8_Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i< a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j <2 ; j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
