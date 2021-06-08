package Pattern;

public class Pattern10 {

	public static void main(String[] args) {

		
		
		int p=0;
		
		int k=0;
		int sp=6;
		for(int i=1 ; i<=9;i++)
		{
			if(i>1 && i<=9)
			{
				k=k+2;
			}else
			{
				k++;
			}
			
			for(int o=sp;o>=0;o--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=k ; j++)
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
			sp--;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
