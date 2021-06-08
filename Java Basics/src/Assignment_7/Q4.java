package Assignment_7;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int numOfPositive=0;
		int numOfNegative = 0;
		int numOfOdd = 0;
		int numOfEven =0;
		int numOfzero = 0;
		
int a[] = new int[20];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:"+a.length+" NUmbers");
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for ( int i = 0 ; i < a.length ; i++)
		{
			if(a[i]>0) {
				numOfPositive++;
					
			}else 
			{
				numOfNegative++;
			} 
			if(a[i] % 2 == 0)
			{
				numOfEven++;
			}else
				
			{
				numOfOdd++;
			}
			if(a[i]==0)
			{
				numOfzero++;
			}
		}
		
		
		System.out.println("Number of Positive : "+numOfPositive);
		System.out.println("Number of Negative : "+numOfNegative);
		System.out.println("Number of Even :"+numOfEven);
		System.out.println("Number of Odd :"+numOfOdd);
		System.out.println("Number of Zero :"+numOfzero);
	}

}
