package Array7;

import java.util.Scanner;

public class LowerTringle {

	public static void main(String[] args) {

		
		int [] a = {1,3,4,7,4,5};
		int sum;
		Scanner sc = new Scanner(System.in);

		sum = sc.nextInt();
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(sum == a[i]+a[j])
					
					System.out.println(a[i]+" "+a[j]);

					
			}

		}
		
	}

}
