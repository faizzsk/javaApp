
public class Binary {

	public static void main(String[] args) {

		
		
		int num = 12 ;
		String ans="";
		
		while (num > 0)
		{
			int r = num % 2;
			 ans = r+ans;
			num = num/2;
		}
		System.out.println(ans);
		
		
		
		
		
	}

}
