package ArrayTest_4;

public class Q5 {

	public static void main(String[] args) {

		
		int a[][] = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{3,4,9,0}};
		int sum = 0 ;
		
		for(int i = 0 ; i <a.length ; i++)
		{
			for(int j = 0 ; j <a.length;j++)
			{
				if((i+j) >= a.length-1)
				{
					sum = sum + a[i][j];
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		
		
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
