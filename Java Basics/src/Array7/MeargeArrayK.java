package Array7;

public class MeargeArrayK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8};
		int c[] = new int[a.length+b.length];
		int cnt = 0;
		
		
		for(int i = 0 ; i<a.length ; i++)
		{
			c[cnt] = a[i];
			cnt++;
		}
	
		for(int j = 0 ; j < b.length ; j++)
		{
			c[cnt++] = b[j];
		}
	
		
		for(int i = 0 ; i <cnt ; i++)
		{
			System.out.print(c[i]);
		}
	}

}
