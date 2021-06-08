package Day_3_OOPs;

import java.util.Scanner;

public class TwinPrime {
	public static int num1;
	public static int num2;
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two prime number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}

	 int checkPrime(int n)
	 {
		 int check = 0;
		 for ( int i = 2 ; i <= n/2 ; i++)
		 {
			 if(n % i == 0)
			// System.out.println(""+n);
				 return 0;
			 	
		 }
		return 1 ;
	 }
	
	
	
	public static void main(String[] args) {

		
		TwinPrime tp = new TwinPrime();
		
		tp.accept();
	//	int n1 = tp.checkPrime(num1);
		int diff=0;
		
		if(tp.checkPrime(num1) == 1 && tp.checkPrime(num2)== 1)
		{
			diff = num2-num1;
			
		}
		
		if(diff == 2 || diff == -2)
		{
			System.out.println("Twin Prime");
		}else
		{
			System.out.println("Not Twin Prime");
		}
		
		
		
	}

}
`