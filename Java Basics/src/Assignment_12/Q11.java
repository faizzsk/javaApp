package Assignment_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q11 {

	public static void main(String[] args) {

		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("sunday");
		a.add("monday");
		a.add("tuesday");
		a.add("wednesday");
		a.add("thrusday");
		a.add("friday");
		a.add("saturday");
		
		
		Iterator<String> itr = a.iterator();
			
			
		
		while(itr.hasNext())
		{
			//String r = itr.next();
			
			if(itr.next().length() >= 7)
			{
				itr.remove();
				
			}
		}
		System.out.println(a);
		
		
		
		for(int i = 0 ; i < a.size() ; i++)
		{
			if(a.get(i).length() >= 7)
			{
				a.remove(i);
				i--;
			}
		}
	}

}
