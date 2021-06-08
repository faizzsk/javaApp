package hw;

public class Pattern5 {

	public static void main(String[] args) {
		

		for(int i = 1 ; i <=13 ; i+=2)
		{
			for(int sp = 0; sp <= i; sp+=2)
			{
				System.out.print(" ");
			}
			for(int j = 13 ; j >=i ; j--)
			{
				System.out.print("*");
			}
			
			
			for (int sp1 =2 ; sp1 <= i ; sp1+=2)
			{
				System.out.print("  ");
			}
			
			for(int k = 13 ; k >=i ; k--)
			{
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
		
		
		
	}

}
