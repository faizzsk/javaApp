package Array7;

import java.util.Arrays;

public class oddEvenPair {
	
	
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

		int[]  a = {1,5,3,2,4,6,8,9};
		int[] b = new int[a.length];
		
		int k =0;
		
		for(int i = 0 ; i < 15 ; i++)
		{
			for(int j = i;j< 15 ; j++)
			{
				if(even(a[i])==1) {
					b[k]=a[i];
					k++;
				}else
				{
					k++;
					b[k]=a[i];
				}
			}
			if(k==9)
			{
				break;
			}
				System.out.println(b[k]);
		}
		
		
		System.out.println(Arrays.toString(b));
		
		}
		
	}


