
public class Frequency {

	public static void main(String[] args) {

		//int cnt = 0;
		long num = 9028925229L;

		long originalNum = num;
		for(int i = 0 ; i < 10 ; i++)
		{
			int cnt =0;
			num = originalNum;
			
				while(num > 0)
				{
					long rem = num % 10;
					
					if(rem == i)
					{
						cnt++;
						
						
					}
					num = num/10;
					
					
				}
				if(cnt>0)
				{
					System.out.println("Frequency of : "+i+" is "+cnt);
				}
				

		}
		
		
		
		
	}

}
