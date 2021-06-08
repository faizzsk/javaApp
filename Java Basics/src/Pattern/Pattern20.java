package Pattern;

public class Pattern20 {

	public static void main(String[] args) {

		float sp=0;
		for(int i = 1 ; i <=5 ; i++)
		{
			for(int k = 0 ; k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j = 5 ; j>=i ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			sp= (float) (sp + 0.5);
		}
		
	}

}
