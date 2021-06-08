package Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i= 9;i>=5;i--)
		{
			
			for(int sp=9;sp>i;sp--)
			{
				System.out.print(" ");
			}
			
			for(int j = i;j>=5;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

}
