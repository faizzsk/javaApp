package ENP_Test_3;

public class Q5 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i<=9;i+=2)
		{
			for(int j = i ; j <=9 ; j+=2)
			{
				System.out.print(j);
			}
			for(int k = 1 ; k <= i-2 ; k+=2)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
	}

}
