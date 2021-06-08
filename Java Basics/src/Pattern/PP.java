package Pattern;

public class PP {

	public static void main(String[] args) {
	
		
		int ch = 65;
		
		for (int r = 1 ; r <=5 ;r++)
		{
			for (int c = 1; c<=r; c++)
			{
				System.out.print((char)ch);
				ch++;
				
			}
			System.out.println();
			ch = 65;
		}
		

	}

}

//1
//12
//123
//1234
//12345

