package ArrayHW2_march_2020;

import java.util.Arrays;

public class Alternate3 {

	public static void main(String[] args) {

		
		int []a = {1,2,3,4,5,6,7,8};
		int [] b = {11,22,33,44,55};
		int []c=new int[a.length+b.length];
		int i =0 , j=0, k=0;
		
		while(i < a.length && j < b.length)
		{
			c[k++]  = a[i++];
			c[k++] = b[j++];
		}
	
		while(i<a.length )
		{
			c[k++]=a[i++];
		}
		while(j < b.length)
		{
			c[k++]=b[j++];
		}
		
		
		System.out.print(Arrays.toString(c));
	}

}
