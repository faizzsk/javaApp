package Assignment2;

public class KrishnamurthyNumber {

	public static void main(String[] args) {

		
		int num = 145 ;
		int fact = 1;
		int sum = 0;
		int n = num;
		while (num > 0)
		{
			int r = num % 10 ;
			
			for (int i = r ; i>=1;i--)
				
			{
				fact = fact * i ;
			}
			sum = sum + fact;
			fact =1;
			num = num/ 10 ;
			
		}
		
		if (n == sum)
		{
			System.out.println("Number is Krishnamurthy");
		}
		else
		{
			System.out.println("NUmber is not Krishnamurthy");
		}
		
		
		
		
		
	}

}
