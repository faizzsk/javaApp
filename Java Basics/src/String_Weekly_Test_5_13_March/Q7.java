package String_Weekly_Test_5_13_March;

import java.util.Arrays;

public class Q7 {
	
	public static String duplicateRemove(char[]a, int n)
	{
		
		//char[]a=s.toCharArray();
		int index=0;
		
		
		for(int i = 0 ; i<a.length;i++)
		{
			int j ;
			for(j = 0 ; j < i ; j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			}
			if(j==i)
			{
				a[index]=a[i];
				index++;
			}
			
		}
	//	s = str.toString();
        return String.valueOf(Arrays.copyOf(a, index)); 
		//return str.toString();
	}

	public static void main(String[] args) {

		String s1 ="india is great";
		String s2 = "in";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		
		
		String str1= duplicateRemove(ch1, ch1.length);
		String str2 = duplicateRemove(ch2, ch2.length);
		
		System.out.println(str1);
		
		String[] a = str1.split("");
		String [] b=str2.split("");
		
		
		for(int i=0;i<a.length;i++)
		{
		  int p1=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]="";
				}
			}
		}
		
		
	//	String t=a.toString();
		//String l=t.trim();
		//System.out.println(l.toString());
	System.out.println("outut"+Arrays.toString(a));

		
		
		
		
		//String u=Arrays.toString(out);
	//	System.out.println(u);
////		
//		for(int i = 0 ; i < ch2.length; i++)
//		{				
//			int isP=0;
//
//			for(int j = 0 ; j < ch1.length;j++)
//			{
//				if(ch2[i]==ch1[j])
//				{
//					isP=1;
//					break;
//				}
//			}
//			if(isP==0)
//			{
//				fg=fg+ch1[i];	
//			}
//		}
//		
//		
		
		//System.out.println(fg);
		
	/*	
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		String dr="";
		
		
		for(int i = 0 ; i < ch1.length;i++)
		{int cnt=0;
		
			for(int j = 0 ; j < ch2.length;j++)
			{
				if(ch1[i]!=ch2[j] )
				{
					dr=dr+ch1[i];
				}
			}
		}	
		System.out.println(dr);
		
		
		
		
		
		
	}
*/
}}
