package Pattern;

public class Pattern2 {

	public static void main(String[] args) {

		
		
		int num = 0;
		for (int r =1 ; r <= 5 ; r++)
		{
			for(int c = r ; c>=1;c--)
			{
				if(c % 2 == 1)
				{
					System.out.print("0");
					//num =0;
				}else
				{
					System.out.print("1");
				}
			}
			System.out.println();

		}
		
		
		
		
	}

}
