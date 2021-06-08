package enpTest;

public class HarshadNumber {

	public static void main(String[] args) {

		
		
		int a = 158;
		int n = 158;
		int sum = 0 ;
		while(a > 0)
		{
			int rem = a % 10 ;
			sum = sum + rem;
			int num = a/10;
			a = num;
		}
		System.out.println(sum);
		if(n % sum == 0)
		{
			System.out.println("Harshad Number");
		}else
		{
			System.out.println("Not A harshad Number");
		}
		
		
		
		
		
		
		
		
	}

}
