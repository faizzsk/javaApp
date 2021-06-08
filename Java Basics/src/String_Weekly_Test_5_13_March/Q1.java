package String_Weekly_Test_5_13_March;

public class Q1 {
int resultstart;
int lenght;
	static String longestwithchar(String str,int l ,int r)
	{
		if(l>r)
			return null;
		while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r))
		{
			l--;
			r++;
		}
		return str.substring(l+1,r);
	}
	
	static String longPalindrom(String s)
	{
		if(s==null)
		{
			return null;
		}
		
		String longest = s.valueOf(s.charAt(0));
		
		for(int i = 0 ; i < s.length()-1;i++)
		{
			String r = longestwithchar(s,i,i);
			String l = longestwithchar(s,i,i+1);

			if(r.length()>longest.length())
			{
				longest = r;
			}
		}
		
		return longest;
	}
	
	public static void main(String[] args) {

		
		
		String s="kajal";
		System.out.println(longPalindrom(s));
		
		
		
		
	}

}
