package StringClassWork;

public class Anagram {

	public static void main(String[] args) {

		
		String s1 = "silentn";
		String s2 = "listenn";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		int flag=0;
		if(s1.length() == s2.length())
		{
			for(int i = 0 ; i <s1.length();i++)
			{ 
				int cnt=0;
				int cnt1=0;
				char ch = s1.charAt(i);
				
				for(int j = 0 ; j < s2.length();j++)
				{
					if(s1.charAt(j)==ch)
					{
						cnt++;
					}
					if(s2.charAt(j)==ch)
					{
						cnt1++;
					}
				}
			
				if(cnt != cnt1)
				{
				flag ++;
				break;
				}
		}
		
		if(flag == 1)
		{
			System.out.println("Not anagram");
		}else
		{
			System.out.println("Anagram");
		}
		}
		else
		{
			System.out.println("length is not same");
		}
		
	}

}
