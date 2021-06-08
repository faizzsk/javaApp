package String_Weekly_Test_5_13_March;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {

		String s="listen";
		char[] ch=s.toCharArray();
		String s1 ="siluent";
		char ch1[]=s.toCharArray();
		
		int len1=s.length();
		int len2=s1.length();
		
		//if(len1!=len2)
		//{
			//System.out.println("not angram");
		//}
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		int f=0;
		if(len1!=len2)
		{
		f++;}
		
		for(int i=0;i<len1;i++)
		{		
			
			if(ch[i]!=ch1[i])
			{
				f++;
				break;
			}
			
		}
		
		
		if(f==0)
		{
			System.out.println("angram");
		}
		else
		{
			System.out.println("not angram");
		}
		

	}

}
