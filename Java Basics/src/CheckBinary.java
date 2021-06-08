
public class CheckBinary {

	public static void main(String[] args) {

		int num = 1101;
		long sum = 0;
		int cnt =0;
		int check = 0 ;
		
		while(num > 0)
		{
			
			int r = num % 10;
			if(r > 1)
			{
				check++;
				break;
			}
			
			
				sum = (long) (sum + (r*Math.pow(2, cnt)));
				num = num/10;
				cnt++;
			

		}
		if(check <=0)
		{
			System.out.println(sum);
			
		}else
		{
			System.out.println("Enter Valid Number");
		}
	
		

		
		
		
		
		
		
	}

}
