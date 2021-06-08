package Assignment_13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q6 {

	public static void main(String[] args) {

		
		ArrayList<String> 	k 	= 	new ArrayList<String>();
		LinkedList<String>	r 	= 	new LinkedList<String>();
		
		k.add("sun");
		k.add("sun");
		k.add("mon");
		k.add("mon");
		k.add("tue");
		k.add("wed");
		
		for(int i = 0 ; i < k.size() ; i++)
		{
			int cnt=0;
			
			for(int j = 0 ; j < k.size() ; j++)
			{
				if(k.get(i).equalsIgnoreCase(k.get(j)))
				{
					
					cnt++;
				}
			}
			if(cnt >1)
			{
				//
				//r.add(k.get(i));
				if(!r.contains(k.get(i)))
				{
				r.add(k.get(i));
				}
				
			}
		

		}
		
		System.out.println(r);
//		for(int i = 0 ; i < r.size() ; i++)
//		{	int j =0;
//			for(j=0 ; j <r.size();j++) {
//				if(r.get(i)==r.get(j))
//				{
//					break;
//				}
//			}
//			if(i==j)
//			{
//				r.remove(i);
//			//	i--;
//				//System.out.println(r.get(i));
//			}
//		}
//		System.out.println(r);
	}

}
