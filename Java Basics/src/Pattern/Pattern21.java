package Pattern;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for(int i = 1 ; i <= 5;i++)
		{
			for(int j=i; j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(char i ='A';i<='F';i++)
		{
			for(char ch = 'A'; ch<=i;ch++)
			{
				if(ch=='A' || ch==i || i=='F')
				{
					System.out.print(ch);
				}else {
				System.out.print(" ");}
			}
			System.out.println();
		}
	}

}
