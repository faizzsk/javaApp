package Pattern;

public class Pattern13 {

	public static void main(String[] args) {

		
		char ch = 'A';
		
		
		for(int i = 6 ; i>=1 ; i--)
		{
			for(char j = 1; j <= i ; j++)
			{
				System.out.print((char)ch);
				ch++;
			}
			ch='A';
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
