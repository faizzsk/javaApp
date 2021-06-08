package Hw_11_feb;

import Assignment2.SumOfDigit;

public class Smith_Number {
	
	public static int sumD(int a)
	{
		int sum = 0;
		while(a>0)
		{
			int r = a % 10;
			sum = sum + r ;
			a = a/10;
			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {

		
		int num = 58;
		
		int temp = num;
		
		int sum = 0;
		System.out.println(sum);
		int a =num;
		int i=2;
		int sum1=0;
		while(num>1)
		{
			//int c = i/10;
			
			if(num % i==0)
			{
	
				sum1= sum1 + sumD(i);
				num = num /i ;
				
			}
			else
			{
				i++;
			}
		}
		if(sum1 == a)
		{
			System.out.println("Smith Number");
		}else
		{
			System.out.println("Not a Smith Number");
		}
	//	System.out.println(sumD(a));
		//System.out.println(sum1);
	}

}
