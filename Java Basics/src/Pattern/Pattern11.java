package Pattern;

public class Pattern11 {

	public static void main(String[] args) {

		
		int k=17;
		int p=0;
		
		for(int i = 9 ; i>=1;i--)
		{
			if(i>0)
			{
				k =k-2;
			}
			
			
			for(int j = 1; j<=k;j++)
			{
				if(j<=(k/2)+1)
				{
					p++;
				}else
				{
					p--;
				}
				System.out.print(p);
			}
			System.out.println();
			p=0;
		}
		
		
		
		
		
		
		
	}

}
