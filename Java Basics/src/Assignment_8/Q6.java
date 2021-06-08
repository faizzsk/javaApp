package Assignment_8;

public class Q6 {

	public static void main(String[] args) {

		
		
		int[][]a = {{1,2,3},{4,9,6},{7,1,9}};
		
		
		int sum = 0;
		
		for(int i = 0 ; i <a.length ; i++)
		{
			
			
			for(int j = 0 ; j <a[i].length;j++)
			{
				if(i == j)
				{
					sum = sum + a[i][j];
				}
			}
			
		}
		System.out.println("sum of main diagonal :"+sum);
		
		
		
		
		
		
	}

}
