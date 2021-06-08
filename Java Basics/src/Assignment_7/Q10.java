package Assignment_7;

public class Q10 {
	
	
	public static double average(int[]arr)
	{
		double sum = 0;
		double avg=0;
		
		for(int i = 0 ; i<arr.length;i++)
		{
			sum = sum + arr[i];
			avg = sum / arr.length;
			
		}
		System.out.println(sum);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,3,4,5,6,7};
		System.out.println(average(a));
	}

}
