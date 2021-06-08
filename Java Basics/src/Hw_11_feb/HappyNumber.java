package Hw_11_feb;

public class HappyNumber {

	public static void main(String[] args) {

		
		
		
		int num = 14;
		int temp = num ;
		int sum = 0;
		
		while(sum !=1  && sum!=4)
		{
			System.out.println("in while");
			sum=0;
			while(temp != 0)
			{
			//System.out.println("in inner while");
				int r = temp % 10;
					sum = sum + (r*r);
					temp = temp/10;
			}
			
			temp =sum;
		}
		
		
		if(sum==1)
		{
			System.out.println("number is happy number");
		}else
		{
			System.out.println("not a happy number");
		}
		
		
		
	}

}
