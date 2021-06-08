package Assignment_8;

import java.util.Scanner;

public class Q7 {
	static int  m = 2;
	static int  n = 3;
	
	public static void main(String[] args) {

		
		//System.out.println("lenaght "+a.length);
	
		int[][] a = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j =0 ; j< a[i].length;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		//sum=0;
		
		int row=2;
		int col=3;
		
		for(int i = 0 ; i <col ; i++)
		{

			for(int j = 0 ; j<row;j++)
			{
				
				sum = sum + a[j][i];

				
			}				
			System.out.print(sum+" ");
			
			sum=0;

		}
	//	System.out.print(sum);
		
		
		
		
		
		
	}

}
