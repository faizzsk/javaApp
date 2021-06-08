package Array_Weekly_Test_4_6_March;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {

		int []a = {-1,-4,1,-9,-8,3,5,-6};
		int b[]=new int[a.length];
		int i = 0 , j = 0 , k=0;
		
		while(i<a.length)
		{
			if(a[i]>0)
			{
				b[k++]=a[i++];
			
			
				//b[k++]=a[i++];
			}
		}
		System.out.println(Arrays.toString(b));
		
		
	}

}
