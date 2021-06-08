package HW10_FEB;

import java.util.Scanner;

public class Sum_of_alternte {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit Number");
		num = sc.nextInt();
		
		int cnt=0;
		int n = num;
		int sum = 0;
		while(num > 0)
		{
			num = num / 10;
			cnt++;
			
		}

		if(cnt == 4)
		{
			while(n>0)
			{
				int r = n % 10 ;
				sum = sum + r;
				n = n /100;
			}
			System.out.println(sum);
		}
		else
		{
			System.out.println("Enter Valid Number");
		}
	}

}
