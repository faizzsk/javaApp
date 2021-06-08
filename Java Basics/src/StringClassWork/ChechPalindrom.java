package StringClassWork;

public class ChechPalindrom {
	
	
	public static boolean isPalindrom(String s)
	{
	      String reverse = new StringBuffer(s).reverse().toString();
	      if (s.equals(reverse))
	      return true;
	      else
	      return false;
	}

	public static void main(String[] args) {

		
		
		System.out.println(isPalindrom("nitin"));
		
	}

}
