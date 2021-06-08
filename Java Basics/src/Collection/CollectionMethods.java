package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CollectionMethods {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		// Collection method
		
		//public boolean add(E e)	
		al.add(129);
		al.add(130);
		al.add(0, 88);//List --> interface add(idx,element)
		al2.add(12);
		al2.add(13);
	
		// addAll
		
		al.addAll(al2);
		al.addAll(0, al2);// List --> interface addAll(idx,Collection)
		// remove
		
		al.remove(0);//remwoving with index
					//removing object
		System.out.println(al);
		
		
		//removeAll
		//al.removeAll(al2);	
		System.out.println(al);
		
		//retainAll
		
		al.retainAll(al2);
		System.out.println(al);
		
		//size
		
		System.out.println(al2.size());

		//clear
		
		al2.clear();
		System.out.println(al2.size());

		
		// contains
		
		System.out.println(al.contains(12));
		
		
		//containsAll
		
		System.out.println(al.containsAll(al2));
		
		//toArray
		Object[] a = al.toArray();
		System.out.println(Arrays.toString(a));	
		
		//public <T> T[] toArray(T[] a)	
		
		
		
		
		//isEmpty
		System.out.println(al2.isEmpty());
		
		
		//equals
		
		System.out.println(al.equals(al2));
		
		
		//List --> interface get & set & indexOf & lastIndex
	
		al.get(0);
		al.set(0, 999);
		al.indexOf(999);
		al.lastIndexOf(40);
		
	}

}
