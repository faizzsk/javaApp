package Array7;

public class MerageArray {

	public static void main(String[] args) {

		
		
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8};
		int c[] = new int[a.length+b.length];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			
			c[i]=a[i];
			
			
		}
		
		for(int j = 0 ; j < b.length ; j++)
		{
			c[j+5] = b[j];
		}
		
		for(int i = 0 ; i<a.length+b.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
