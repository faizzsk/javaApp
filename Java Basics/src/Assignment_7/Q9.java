package Assignment_7;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		
	int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter:"+a.length+" NUmbers");
	
	for(int i = 0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		int cnt=0;
		int flag = 0;
		for ( int i = 0 ; i < a.length ; i++)
		{
			
			for(int j = i+1 ; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					System.out.println("Duplicate :"+a[i]);

					break;
				}
			}

			}
		
		
		
			System.out.println("Total Duplicate Count: "+cnt);
		
		
				
		
		
		
	}

}
