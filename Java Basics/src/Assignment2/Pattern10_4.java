package Assignment2;

public class Pattern10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ch = 65;
		
		for (int i = 1 ; i <=5; i++)
		{
			for (int j = 1 ; j<=i ; j++)
			{
				System.out.print((char)ch);
				ch++;
			}
			ch=65;
			System.out.println();
		}
		
		
		
		
		
	}

}
