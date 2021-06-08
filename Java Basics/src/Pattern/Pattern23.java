package Pattern;

public class Pattern23 {

	public static void main(String[] args) {

		int cnt=1;
		
		for(int i = 1 ; i<=5;i++)
		{
			for(int j = 1 ; j<=5;j++)
			{
				if(i==2 && j==2 || i==3 && j==3 || i==4 && j==4 || i==5 && j==5)
				{System.out.print(cnt);
				cnt++;}
			else
			{
				System.out.print("0");
			}
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
