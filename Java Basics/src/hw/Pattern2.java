package hw;

public class Pattern2 {

	public static void main(String[] args) {
int w=7;
		int midsp=0;
		int cnt = 65 ;
		int kcnt =71;
		for(int i = 1 ; i <= 7 ; i++)
		{
			for (int j = 7 ; j >= i;j--)
			{
				System.out.print((char)cnt);
				//System.out.print(cnt);
				cnt++;
				
			}
			for(int s=1 ; s<=midsp ;s++)
			{
				System.out.print(" ");
			}
			for(int k = kcnt ; k >= 65 ; k--)
			{
				System.out.print((char)k);
				
			}
			cnt =65;
			kcnt--;
			System.out.println();
			midsp=midsp+2;
			
		}
	/*	
		for(int i = 1 ; i <= 7;i++)
		{
			for(int j = 1 ; j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k = 7 ; k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}
