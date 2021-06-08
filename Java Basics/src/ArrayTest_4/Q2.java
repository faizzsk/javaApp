package ArrayTest_4;

public class Q2 {

	public static void main(String[] args) {

		
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int sum = 0;
			int avg=0;
			for(int j = 0 ; j <arr[i].length;j++)
			{
				sum = sum + arr[i][j];
				avg = sum/3;
			}
			System.out.print("Row Avg :"+avg);
		}
		System.out.println();
		for(int i = 0 ; i < 3 ; i++)
		{
			int sum = 0;
			float avg=0;
			for(int j = 0 ; j <4; j++)
			{
				sum = sum + arr[j][i];
				avg = sum/4;
			}
			System.out.print(" Column "+avg);
		}
		
		
		
		
		
		
	}

}
