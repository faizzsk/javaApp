package Collection_Weekly_Test2_10_04_2021;

import java.util.ArrayList;

public class Q1 {

	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A+2");
		list.add("B+14");
		list.add("C+3");
		
		
		ArrayList<Character> al = new ArrayList<Character>();
		ArrayList<Integer>alNum = new ArrayList<Integer>();
		
		//String n="";
		String s = "";
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			
			String str = list.get(i);
			str = str.toUpperCase();
			
			char ch =0;
			int n=0;
			//ch=str.toCharArray();
			
			for(int j = 0 ; j < str.length() ; j++)
			{
				if(str.charAt(j)<='Z' && str.charAt(j)>='A')
				{
					ch=str.charAt(j);	
					al.add(ch); 
				}
				else if(str.charAt(j)<='9' && str.charAt(j)>='0')
				{
					n = Character.getNumericValue(str.charAt(j));
					System.out.print(n);
					

				}
			

			}

			
		}
		
		
		
		
		
		System.out.println(al);
		System.out.println(alNum);
		
		
	}

}
