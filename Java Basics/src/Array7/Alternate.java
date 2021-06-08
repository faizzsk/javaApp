package Array7;

import java.util.Arrays;

public class Alternate {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int b[]= {11,22,33,44,55,66,77};
		int c[] = new int[a.length+b.length];
		int cnt = 0;
		int index=0;
		int a_indx = 0;
		int b_indx = 1 ;
		
		int k = 0 , m =0 ;
		for(int i = 0 ; i < a.length;i++)
		{
			if(a_indx >= a.length)
			{
				//a_indx+=2;
				c[a_indx] = a[i];
				a_indx++;

			}
			else
			{
				//sa_indx++;
				c[a_indx] = a[i];
				a_indx+=2;

			}

			
		}
		
		for (int  j = 0 ; j < b.length ; j++)
		{
			if(b_indx >= b.length)
			{
			//	b_indx+=2;
				c[b_indx] = b[j];
				b_indx++;

			}
			else
			{
				//b_indx++;
				c[b_indx] = b[j];
				b_indx++;

			}

		}
			
			System.out.println(Arrays.toString(c));

	}

}
