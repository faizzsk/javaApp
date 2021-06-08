package Pattern;

public class hollowpyramid {

	public static void main(String[] args) {
int sp=4;
		
		for(int i = 1 ; i <=5 ; i++)
		{
			for(int k = sp ; k>=1 ; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1 ; j<=i;j++)
			{
				if(j==1 || i==5 || j==i)
				{
					System.out.print(" * ");
				}else
				{
					System.out.print("   ");

				}
			}
			sp--;
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
