package ENP_OOPS_TEST_$;

public class IMEI {

	public static void main(String[] args) {

		
		
		long num = 490154203237514l;
		System.out.println(num);
		long O_num = num;
		String a = "";
		String b = "";
		


	int c=0;
		while(O_num>0)
		{
			c++;
			O_num = O_num/10;
		}
//System.out.println(c);

	
	//	int i=1;
	if(c==15)
	{
			while(num > 0)
			{
				for(int i = 1 ; i<= c;i++)
				{
					long r = num % 10;
				
					if( i % 2 == 0)

				{
				//	System.out.println(r);

					
				a = a + (r*2);
			//	
					//System.out.println(i);
				}else {
					a = a + r;
				}
					
				num = num/10;
				}
			}
		
		 //	System.out.println(i);

	}
		
		long p = Long.parseLong(a);
		
	//	System.out.println(a);
		//System.out.println(b);
		
		System.out.println(" "+p);
		long sum = 0;
		
		while ( p > 0 )
		{
			long r = p % 10;
			
			 sum = sum + r;
			 
			 p = p/10;
			
			
		}
		
		
		System.out.println(sum);
		
		
		if(sum % 10 ==0)
		{
			System.out.println("Valid IMEI");
		}else {
			System.out.println("Not Valid IMEI");
		}
		
	}

}
