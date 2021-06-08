package Assignment_9;

public class Q22 {

	public static void main(String[] args) {

		String s ="madamk";
		int flag=0;
	//	int start = 0;
		//int end = s.length()-1;
		
		int len=s.length()-1;
		int b=0;
	//	if(start != end)
		//{
			//	System.out.println("not a spl word");
		//}else
		//{
			//System.out.println("spl");

		//}
		
		
		for(int end =len,start=0;start<=len/2;start++,end--)
		{
			char ch[]=s.toCharArray();
			if(ch[start] != ch[end])
			{
				flag=1;
			}
		
		//	start = s.charAt(index);

			//end--;
		}
		
		if(flag>0)
		{
			System.out.println("not palindrom");
		}else {
			System.out.println("palindrom and spl number");

		}
		
		if(s.charAt(0)!=s.charAt(s.length()-1))
		{
			System.out.println("not spl number");
		}
		
	}

}
