package Pattern;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=0;
		for(int i = 0 ; i<=9;i++)
		{
			if(i <= 5)
			{
				k++;
			}else
			{
				k--;
			}
			
			for(int j = 1 ; j<=k;j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

}
