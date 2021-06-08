package Collection_Weekly_Test2_10_04_2021;

public class Q4 {
	

	public static void main(String[] args) {
		
		
		int num = 192;
		int onum=num;
		
		int cnt=0;
		while(num > 0)
		{
			cnt++;
			num = num/10;
		}
		long l=0;
		String sum ="";
		if(cnt > 2)
		{
			for(int i = 1 ; i <= cnt ; i++)
			{
				sum = sum + onum*i;
			}
			
			System.out.println(sum);
			 l = Long.parseLong(sum);
		}
		
		int p=0;
		
		
		
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			int cntt=0;

			while(l>0)
			{
			long r = l%10;
			
			if(r==i)
			{
				cntt++;
			}
			
			l=l/10;
			}
			System.out.println(cntt);
			
			if(cntt>1)
			{
				System.out.println("not");
				break;
			}else
			{
				System.out.println("yes");
				break;
			}
			
		
		}
		
		
		
		
		
	}

}
