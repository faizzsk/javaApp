package Hw_11_feb;

public class Kaprekar {

	public static void main(String[] args) {

		
		
		int num = 45;
		int temp=num;
		int c=1;
		
		int sq = num * num;
		while (temp !=0)
		{
			
			c = c * 10;
			temp = temp/10;
			
			
		}
		
		int a = sq % c;
		int b = sq / c;
		int sum = a + b;
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("Number is kaprekar");
		}else
		{
			System.out.println("Number is not a kaprekar");
		}
	}

}
