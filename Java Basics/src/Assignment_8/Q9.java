package Assignment_8;

import java.util.Scanner;

public class Q9 {

	
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
		
		
		
		for(int i = 0 ; i < a.length ; i++)
		{
			int max =a[i][i];
			for(int j = 0 ; j <a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max = a[i][j];
				}
				
			}
			System.out.println("row "+i+" max");
			System.out.println(max);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
