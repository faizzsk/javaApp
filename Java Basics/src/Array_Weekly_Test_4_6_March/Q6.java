package Array_Weekly_Test_4_6_March;

import java.util.Arrays;

public class Q6 {
	
	public static void main(String[] args) {

//INCOMPLETE IGNORE THIS
		int a[]= {1, 2, 3, -4, -1, 4};
		
		int i = -1 , temp = 0 ;
		
		for(int j = 0 ; j <a.length ; j++)
		{
			if(a[j]< 0)
			{
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		int neg=0; int pos = i+1;
		int start = 1;
		int end = a.length;
			
		int j=0;
		
		
		for(int k = 0 ; k < a.length;k+=2)
		{
			if(a[k]<0)
			{
				j = k+ 1;
			
				while(j<a.length)
				{
					if(a[j]>0)
					{
						int temppp= a[i];
						a[i]=a[j];
						a[j]=temppp;
						break;
					}else {
						j++;
					}
				}
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
			
			//System.out.println(a[j]);
		
		
		
		
		System.out.println(Arrays.toString(a));
	
	
	
	
	
	
	
	}}
