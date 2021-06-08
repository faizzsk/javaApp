package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {

	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		
		
		al.add("Faiz");
		al.add("Sneha");
		al.add("Rahul");
		al.add("Fatima");
		al.add("Rifa");
		
		
		Iterator<String> itr = al.iterator();
		int i=0;
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
			al.add("Zishan");
		
		}
		System.out.println(al);

		}
		
		
		
		
	}


