package Assignment_12;

import java.util.ArrayList;
import java.util.Iterator;

public class Q6 {

	public static void main(String[] args) {

		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 1 ; i <= 50;i++)
		{
			a.add(i);
		}
		
		
		Iterator<Integer> itr = a.iterator();
		
		//int i =0;
		
		
		while (itr.hasNext()) {
			
			int temp = itr.next();
			
			if(temp % 2 == 0)
			{
				System.out.println(temp);
			}
			
		}
	}

}
