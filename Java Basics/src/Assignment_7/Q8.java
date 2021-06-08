package Assignment_7;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		//int min = 0 ;
		
	//	int max = 0 ;
		int min1=0;
		int max2=0;
		
	
		int min=0;
		int max=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:"+a.length+" NUmbers");
		
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		for ( int i = 0 ; i < a.length ; i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					min = a[i];
					break;
				}
				else if(a[i]>a[j])
				{
					max=a[i];
					break;
				}
			}
		}
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);		
		
		
		
		
		
		
		
		
	
	}

}
