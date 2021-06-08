package enpTest;

public class SpyNumber {

	public static void main(String[] args) {

		
		int a = 123 ;
		int sum = 0;
		int mult=1;
		while(a>0)
		{
			int mod = a%10;
			sum = sum + mod;
			mult = mult * mod;
			int newnum = a/10;
			a = newnum;
			
		}
		//System.out.println(sum+""+mult);
		
		if(sum == mult)
		{
			System.out.println("Given Number is a spy number");
		}else
		{
			System.out.println("Given Number is not a spy number");

		}
		
	}

}
