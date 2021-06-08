package Collection_Weekly_Test2_10_04_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_A {

	public static void main(String[] args) {

		

		ArrayList<String> list = new ArrayList<String>();
		list.add("A+2");
		list.add("B+14");
		list.add("C+3");
		
		ArrayList<Character> al = new ArrayList<Character>();
		ArrayList<Integer>alNum = new ArrayList<Integer>();

		
		for(int i = 0 ; i < list.size() ; i++)
		{
			int num =0;
			String ss = list.get(i);
			
			String[] kk = ss.split("[+]");
			System.out.println(Arrays.toString(kk));
			for(int j = 0 ; j < kk.length ;j++)
			{
				if(j==0)
				{
					
					//System.out.println(kk);
					char ch = kk[j].charAt(j);
					al.add(ch);
				}
				else
				{
					num = Integer.parseInt(kk[j]);
					alNum.add(num);
					//System.out.println(num);
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String n="";
//		String s = "";
//		
//		for(int i = 0 ; i < list.size() ; i++)
//		{
//			
//			String str = list.get(i);
//			str = str.toUpperCase();
//			
//			char ch =0;
//			int n=0;
//			//ch=str.toCharArray();
//			
//			for(int j = 0 ; j < str.length() ; j++)
//			{
//				if(str.charAt(j)<='Z' && str.charAt(j)>='A')
//				{
//					ch=str.charAt(j);	
//					al.add(ch); 
//				}
//				
//				
//						
//			}
//
//			
//		}
//		
//
//	
//		
		
		
		System.out.println(al);
		System.out.println(alNum);
		
		
	

	}

}
