package Assignment_9;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String ");
		String s1=sc.nextLine();
		System.out.println("len "+s1.length());

		char arr[]=s1.toCharArray();
		
		int firstPos=-1;
		int lastPos=-1;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				firstPos = i;
				break;
			}
		}
		
		
		for(int i=arr.length-1; i>=0; i--)
		{
			if(arr[i]!=' ')
			{
				lastPos=i;
				break;
			}
		}
		

		
		System.out.println("length-->"+s1.substring(firstPos,lastPos+1).length());
		
		System.out.println(s1.substring(firstPos,lastPos+1));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

/*
		String s = "      abc faiz  ";

		String s1[]=s.split(" ");
		//String o=s.replaceAll("\\+", " ");
		//	System.out.println(o);
		String p = "";
		String k="";
		//	System.out.println(Arrays.toString(s1));

		for(int i =0; i<s1.length;i++)
		{
			char ch[]=s1[i].toCharArray();

//			//System.out.print(Arrays.toString(ch)+" ");
//			//System.out.print(" ");
//
//			for(int j = 0 ; j < ch.length; j++)
//			{
//				if(ch[i]!=' ')
//				{
//					p = p+ch[j];
//				}
//
//			}
//			//System.out.println(i.length());
//			p = p + " ";
	//	}
//
	}
	//			if(ch[i]!=' ')
	//			{
	//				p = p + ch+"";
	//			}
	//			


//	System.out.println(p);


	//	String x[]=p.split();
	///System.out.println(Arrays.toString(x));



			
		String w="";

		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);

			if(ch !=' ')
			{
				w = w+ch;
			}
			
			
		}
		System.out.println(w);
	//	System.out.println(s);

*/

}}


