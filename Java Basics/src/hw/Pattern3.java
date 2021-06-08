package hw;

public class Pattern3 {

	public static void main(String[] args) {

		int app=0;
		int sp=1;
		int sp2=0;
		for ( int i = 1  ; i <= 9; i=i+2)
		{
			for(int k = 2 ; k<=i; k=k+2)
			{
				System.out.print(" ");
			}
			for(int j = 5 ; j>=i ; j--)
			{
				System.out.print("*");
			}
		//	for(int k = 3 ; k<=i;k=k+3)
		//	{
		//		System.out.print(" ");
		//	}
			for (int k = 1 ; k<=sp2;k=k+2)
			{
				System.out.print(" ");
			}
			for(int j = 5 ; j>=i ; j--)
			{
				System.out.print("*");
			}
			
			sp2 = sp2+3;
			System.out.println();
		}
		}
		
		
		
		
	

}
