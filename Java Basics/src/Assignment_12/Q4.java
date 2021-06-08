package Assignment_12;

import java.util.ArrayList;
import java.util.Iterator;

public class Q4 {

	public static void main(String[] args) {

		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(14);
		al.add(24);
		
		for(int i = 0 ; i < al.size() ; i++)
		{
			System.out.println(i+"- "+al.get(i));
		}
		
		for(int temp : al)
		{
			System.out.println(temp);
		}
		
		
		Iterator<Integer> iterator = al.iterator();
for(int i = 0 ; i < al.size() ; i++) {
		System.out.println(iterator.next());
}
	}

}
