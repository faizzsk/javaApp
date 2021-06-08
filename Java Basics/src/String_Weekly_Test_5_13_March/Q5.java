package String_Weekly_Test_5_13_March;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q5 {
	
	
	

	public static void main(String[] args) {
//sreh topleH

		
		
		String str = "help others";
		
		char ch1[]= str.toCharArray();
		char ch2[]= str.toCharArray();
		
		int j = ch2.length-1;
		
		for(int i = 0 ; i <ch1.length;i++)
		{
			if(ch1[i]==' ')
			{
				ch2[i]=' ';
			}
		}
		
		
		for(int i = 0 ; i < ch1.length ; i++)
		{
			if(ch1[i]!=' ')
			{
				if(ch2[j]==' ')
				{
					j--;
				}
				
				ch2[j]=ch1[i];
				j--;
			}
		}
		
		System.out.println("OutPut");
		
		for(int i = 0 ; i<ch2.length;i++)
		{
			System.out.print(ch2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//reverses("help others");
		
		/*String s="Help Others";
		
		char[] ch = s.toCharArray();
		String []str= s.split(" ");
		String bb="";
		
		
		
		for(int i = ch.length-1 ; i >=0;i--)
		{
			if(ch[i]!=' ')
			{
				bb=bb+ch[i];
			}
		}
		
		String [] strr = bb.split("");
		String gf="";
		
		for(int i= 0 ; i < str.length;i++)
		{
			char  chh[]=strr[i].toCharArray();
			
			strr[i]=str[i];
			
		}
		System.out.println("gf"+gf);
		System.out.println(bb);
		
		System.out.println(Arrays.toString(strr));
		
		
		
		
		System.out.println();
		
		
		
		
		for(int i=0;i<str.length-1;i++)
		{
		
			String temp = str[i];
			str[i] =str[i+1];
			str[i+1]=temp;
			
			
			
		}
		
		
		System.out.println(Arrays.toString(str));
		
	}
*/
}}
