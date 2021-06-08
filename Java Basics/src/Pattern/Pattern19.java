package Pattern;

public class Pattern19 {

	public static void main(String[] args) {

		
		
		
		
		int cnt = 0;
		
		for (int i = 1 ; i<= 5 ; i++)
		{
			if(i % 2 != 0)
			{
				for(int j = 1 ; j<=3;j++)
				{
					cnt++;

					System.out.print(" "+cnt);
				}
			}else
			{
				int temp = cnt+1;
			for(int j = cnt+3 ; j >=temp ; j--)
			{
				System.out.print(" "+j);
				cnt++;	
	
			}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
