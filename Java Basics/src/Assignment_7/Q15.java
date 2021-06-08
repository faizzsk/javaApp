package Assignment_7;

public class Q15 {

	public static void main(String[] args) {

		
		int[] a = {72,69,76,76,79};
		
		
		for(int i = 0 ; i<a.length ; i++)
		{
			
			int r = a[i]%10;
			if(r==9)
			{
				a[i]= 0;
			}
			else
			{
				a[i]=a[i];
			}
			
		System.out.println(a[i]);	
		}
		
	}

}
