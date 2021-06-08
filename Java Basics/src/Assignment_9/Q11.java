package Assignment_9;

public class Q11 {

	public static String rev(String s)
	{
		String rev="";
		for(int i =s.length()-1 ; i >=0 ; i--)
		{
			char ch = s.charAt(i);
			
			rev = rev + ch;
		}
		
		
		return rev;
	}
	public static void main(String[] args) {

		
		String s = "Faiz";
		
		StringBuffer sb = new StringBuffer("Faizzzzz");
		sb.reverse();
		System.out.println("String buffer reveres:"+sb);
		System.out.println(rev(s));
	}

}
