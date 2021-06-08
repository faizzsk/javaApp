package ArrayHW2_march_2020;

import java.util.Arrays;

public class AlternateMarge {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {11,22,33,44,55};
		int c[] = new int[a.length+b.length*2];
		int cnt = 0;
		int index=0;
		int a_indx = 0;
		int b_indx = 1 ;
		
		int k = 0 , m =0 ;
		for(int i = 0 ; i < a.length;i++)
		{
			if(a_indx <= a.length)
			{
			c[a_indx] = a[i];
			a_indx+=2;
			}
			
			while(i < a.length)
			{
				c[a_indx++]=a[i++];
			}
			
		}
		
		for (int  j = 0 ; j < b.length ; j++)
		{
			if(b_indx <= b.length)
			{
				c[b_indx] = b[j];
				b_indx+=2;
				
			}
		//	else
			//{
				//c[b_indx++]=b[j];
				//b_indx++;

			//}
			
			while(j < b.length)
			{
				c[b_indx++] = b[j++];
			}
		}
		
		
			
			System.out.println(Arrays.toString(c));
		}
	
	}
		
		
