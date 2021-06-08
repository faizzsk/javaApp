package hw;

public class Pattern4 {

	public static void main(String[] args) {

		int a = 65;
		
		for (int i = 1 ; i <= 7 ; i++)
		{
			for (int j = 7 ; j >= i; j-- )
			{
				System.out.print((char)a);
				a++;
			}
			a= 65;
			System.out.println();
		}
		
		
		
		
		
		
	}

}
