package String_Weekly_Test_5_13_March;

public class Q11 {
	
	public static boolean checkrevsum(String s)
	{
		char ch[]=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch.length==1 || ch.length==2)
			{
				break;
			}
			if(ch[i]>='0' && ch[i]<='9')
			{
				if(start <=2)
				{
					sum1 = sum1 + Character.getNumericValue(ch[start]);
					start++;
				}
				if(end>=ch.length-3)
				{
					sum2 = sum2 + Character.getNumericValue(ch[end]);
					end--;
				}
			}
		}
		
		if(ch.length==1 || ch.length==2)
		{
			return false;
		}
		if(sum1==sum2)
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		
		String num="3214";
		
		char ch[]=num.toCharArray();
		int start=0;
		int end=ch.length-1;
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch.length==1 || ch.length==2)
			{
				break;
			}
			if(ch[i]>='0' && ch[i]<='9')
			{
				if(start <=2)
				{
					sum1 = sum1 + Character.getNumericValue(ch[start]);
					start++;
				}
				if(end>=ch.length-3)
				{
					sum2 = sum2 + Character.getNumericValue(ch[end]);
					end--;
				}
			}
		}
		if(sum1==sum2)
		{
			System.out.println("true");
		}else
		{
			System.out.println("false");
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
