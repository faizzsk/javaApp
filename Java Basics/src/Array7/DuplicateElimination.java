package Array7;

import java.util.Arrays;

public class DuplicateElimination {

	public static void main(String[] args) {

		
		int[] a = {1,2,3,1,2,3};
		int[] b=new int[a.length];
		int k=0;
		for(int i = 0 ; i < a.length;i++)
		{
			int flag=0;
			
			for(int j = 0 ; j < k ; j++)
			{
				if(a[i]==b[j])
				{
					flag=1;
					break;
				}
			}
			if(flag == 0)
			{
				b[k]=a[i];
				k++;
			}
			
		}
		
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
	}

}
