package Assignment_7;

public class Q12 {

	public static void varar(int ...a)
	{
		for(int i = 0 ; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {

		varar(1,2,3,4,5,6);
		varar(2,5,6);
		
	}

}
