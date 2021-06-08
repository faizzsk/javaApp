
public class Decimal2Binary {

	public static void main(String[] args) {

		
		int num = 111;
		long sum = 0;
		int cnt =0;
		
		while(num > 0)
		{
			
			int r = num % 10;
			sum = (long) (sum + (r*Math.pow(2, cnt)));
			num = num/10;
			cnt++;



		}
		System.out.println(sum);
	
		
		
		
		
		
	}

}
