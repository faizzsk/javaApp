package HW10_FEB;

import java.util.Scanner;

public class Count_Even_Odd {

	public static void main(String[] args) {

		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit Number");
		num = sc.nextInt();
		

		int cnt = 0;
		int eCnt=0;
		int oCnt = 0;
		
		int n = num;
		while(num>0)
		{
			num = num /10;
			cnt++;
		}
		//System.out.println(cnt);
		
		if(cnt == 3)
		{
			
			while(n>0)
			{
				int r = n % 10;
				
				if(r % 2 == 0)
				{
					eCnt++;
				}else
				{
					oCnt++;
				}
				
				n = n /10;
			}
			System.out.println("Even Count :"+eCnt);
			
			System.out.println("Odd Count :"+oCnt);
			
		}
		
		else
		{
			System.out.println("Enter Valid Number");
		}
		
		
	}

}
