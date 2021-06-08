package enpTest;

public class AmicableNumber {

	public static void main(String[] args) {

		
		
		int a = 220;
		int b = 284;
		
		int sum1=0;
		int sum2=0;
		
		for (int i = 1 ; i <= a ; i++)
		{
			if (a % i == 0)
			{
				sum1 = sum1 + i;
			}
		}
		
		for (int i = 1 ; i <= b ; i++)
		{
			if ( b % i == 0)
			{
				sum2 = sum2 + i;
			}
		}
		
		if(sum1 == sum2)
		{
			System.out.println("Number is Amicable");
		}
		else
		{
			System.out.println("Number is  Not amicable");
		}
		
		
	}

}
