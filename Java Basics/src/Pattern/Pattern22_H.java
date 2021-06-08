package Pattern;

public class Pattern22_H {

	
	public static void main(String[] args) {

		int k=1;
		int p=0;
		for (int i = 1 ; i <= 13 ; i++)
		{
			System.out.print("*");
			
			if(i<=6)
			{
				k = k+2;
			}else {
				k = k-2;
			}
			for (int j = 1 ; j<=k;j++)
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
			p=0;
			System.out.print("*");
			System.out.println();
		}
		
		
	}

}
