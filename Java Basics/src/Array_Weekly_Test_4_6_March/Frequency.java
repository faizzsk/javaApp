package Array_Weekly_Test_4_6_March;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {

		
		int a[]= {3,6,3,8,9,8};
		
		for(int i = 0 ; i <a.length;i++)
		{
			int cnt=0;
			
			for(int j = 0 ; j <a.length;j++)
			{
				if(a[i]==a[j] && j<i)
					break;
				else if(a[i]==a[j])
					cnt++;
			}
			if(cnt>0)
			{
				System.out.println("Frequncy of "+a[i]+" is:"+cnt);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
