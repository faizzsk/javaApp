package Assignment_13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q6_ {

	public static void main(String[] args) {

		
		ArrayList<String> 	al 	= 	new ArrayList<String>();
		LinkedList<String>	ll 	= 	new LinkedList<String>();
		
		al.add("sun");
		al.add("sun");
		al.add("mon");
		al.add("mon");
		al.add("tue");
		al.add("wed");
		
		
		for(int i = 0 ; i < al.size() ; i++)
		{
			
			int cnt=0;
			
			for(int j = 0 ; j < al.size() ; j++)
			{
				if(al.get(i).equalsIgnoreCase(al.get(j)))
				{
					cnt++;
				}
			}
			
			if(cnt > 1)
			{
				if(!ll.contains(al.get(i)))
				{
					ll.add(al.get(i));
				}
			}
			
			
			
		}
		
		System.out.println(ll);
	}

}
