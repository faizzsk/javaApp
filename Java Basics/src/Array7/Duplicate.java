package Array7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {

		int []a = {1,2,3,1,4,5,4};
		
		int[]b = new int[a.length];
		
		int k = 0;
		
		
		for(int i = 0 ; i<a.length;i++)
		{
			int isPresent = 0;
			for(int j = 0 ; j<k;j++)
			{
				if(a[i]==b[j])
				{
					isPresent = 1;
					break;
				}
				
				
				
			}
			
			if(isPresent == 0)
			{
				b[k] = a[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(b));

	}

}
