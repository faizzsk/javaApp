package Weekly_Test_03_04_2021;

import java.util.ArrayList;
import java.util.Collections;

public class Q5 {

	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Fatima");
		al.add("Faizz");
		al.add("Farzana");
		al.add("Fahim");
		
		System.out.println(al);
		
		Collections.sort(al);
		
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);
	}

}
