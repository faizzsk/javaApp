package Pattern;

public class Pattern12 {

	public static void main(String[] args) {

		
		
		int k=0;
		int p=0;
		int q=p;
		for(int i=1 ; i<=9;i++)
		{
		if(i>0)
		 {
			 k=k+2;
		 }else
		 {
			 k=k-2;
		 }
			
			
			for(int j=1;j<=k;j++)
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
