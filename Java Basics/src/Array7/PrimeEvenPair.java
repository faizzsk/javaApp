package Array7;

import java.util.Arrays;

public class PrimeEvenPair {

	
	public static int isPrime(int n)
	{
		int cnt = 0 ;
		for(int i = 2 ; i <= n/2 ; i++)
		{
			if(n%i == 0)
				cnt++;
			break;
	
		}
		if (cnt ==0)
		{
			return 1;
		}else
			
		
		
			
		return 0;
	}
	
	public static int even(int n)
	{
		if(n % 2 == 0)
		{
			return 1;
		}
		else
			return 0;
	}
	
	public static void main(String[] args) {

		
		
		int [] a = {1,5,9,7,3,6,8,13,2,4};
		int [] b = new int[a.length];
		
		int k = 0;
		
		
		
		for(int i = 1 ; i <=a.length-1 ; i++)
		{
			if(isPrime(a[i])==1)
			{
				b[k] = a[i];
				k++;
			}
			
			 if(even(a[i]) ==1)
			{
				b[k+1]= a[i];
				k++;
			}
			if(k==9)
			{
				break;
			}
		}
	
		System.out.println(b.length);
	System.out.println(Arrays.toString(b));
		
/*		for(int i = 0 ; i < k ; i++)
		{
			System.out.println(b[i]);
		}
	*/	
		
		
		
		
		
	}

}
