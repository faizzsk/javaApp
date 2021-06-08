package Collection_Weekly_Test2_10_04_2021;

import java.util.ArrayList;

public class Q6 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		String s="";
		
		list.add("winter");
		list.add("fall");
		list.add("summer");
		list.add("spring");
		list.add("spring");
		list.add("faiz");


		
		
		
		for(int i = 0 ; i < list.size() ; i++)
		{
			String k = list.get(i);
			if(k.length() > i) 
			{
			s = s + k.charAt(i);
			}
			else
			{
				s = s + "#";
			}
		}
		
		System.out.println(s);
		
		
	}

}
