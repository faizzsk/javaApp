package Array7;

public class SecondSmallest {

	public static void main(String[] args) {

		
		int a[]= {5,34,1,6,9,8,6};
		int min=a[0];
		int secondSmall=a[0];
		
		
		for(int i =0 ; i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				secondSmall=min;
				min=a[i];
			}
		
		}
		System.out.println(secondSmall);

	}

}
