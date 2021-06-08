package Assignment_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Q12 {

	public static void main(String[] args) {
		
		
		ArrayList<Emp> l1 = new ArrayList<Emp>();
							
		ArrayList<Emp> l2 = new ArrayList<Emp>();
		
		l1.add(new Emp(2, "Faizz", 5000));
		l1.add(new Emp(29, "Rahul", 400));
		l1.add(new Emp(4, "Mohit", 1293));
		
		l2.add(new Emp(1, "Zish", 5000));
		l2.add(new Emp(29, "Rahul", 400));
		l2.add(new Emp(4, "Mohit", 1293));
		
		LinkedList<Emp> ll = new LinkedList<Emp>();
		
		ll.addAll(l1);
		ll.addAll(l2);
		Collections.sort(ll);
		System.out.println(ll);
		
	}

}
