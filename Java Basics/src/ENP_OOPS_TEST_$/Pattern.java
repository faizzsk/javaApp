package ENP_OOPS_TEST_$;

public class Pattern {

	public static void main(String[] args) {

		int k = 6;
		int ch = 65;
		for (int i = 1 ; i<=9 ; i++)
		{
			if(i<=5)
			{
				k--;
			}else
			{
				k++;
			}
			
			for(int j = 1 ; j <= k ; j++)
			{
				if(i % 2 == 0)
				{
					System.out.print((char)ch);
					ch++;
				}else
				{
					System.out.print(j);
				}
			}
			ch=65;
			System.out.println();
		}
		
		
		
		
		
	}

}
