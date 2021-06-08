package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

		public static void main(String[] args) {

		
		Vector<Integer> v = new Vector<Integer>();
		v.add(60);
		v.add(40);
		v.add(30);
		v.add(20);
		v.add(10);
		v.add(5);
		v.addElement(50);
		System.out.println("Element at "+v.elementAt(4));
		System.out.println("Capacity "+v.capacity());
		
		Enumeration <Integer> itr = v.elements();
		
		
		while(itr.hasMoreElements())
		{
			System.out.println(itr.nextElement());
		}
		
		Collections.sort(v);

		
		System.out.println(v);
		
	}

}
