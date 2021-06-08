package hw;

public class PP {

	public static void main(String[] args) {

		int a=5;
		
		
		char c='e';
		int ch=71;
		
		for (int i=1; i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for (int j=ch;j>=65;j--)
			{
				System.out.print((char)j);
			//	ch--;
				

			}
			ch--;;
			a--;
			System.out.println();
			c--;
		}
	}

}
