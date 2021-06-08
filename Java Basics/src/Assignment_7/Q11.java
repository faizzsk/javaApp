package Assignment_7;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		
		int []a = new int[5];//= {1,-2,6,8,-8,-2};
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		
		for(int i = 0 ; i<a.length;i++)
		{
			
			
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				
				if(a[i]>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
			}
			
			System.out.println(a[i]);
			
		}
		
		
		

	}

}
