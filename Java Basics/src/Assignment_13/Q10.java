package Assignment_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Collection.ReverseOrder;

class sortbynameDe implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareToIgnoreCase(o1);
	}// Way 2
	
}


public class Q10 implements Comparable<String>  {

	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return o.toString().compareTo(this.toString());
	}// Way 1
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Faiz");
		al.add("Rahul");
		al.add("Priya");
		al.add("Mohit");
		
		Collections.sort(al,new sortbynameDe());
	//	Collections.reverse(al); // way 3
		
		System.out.println(al);
	}

}
