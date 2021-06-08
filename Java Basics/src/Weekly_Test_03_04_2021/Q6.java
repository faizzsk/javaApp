package Weekly_Test_03_04_2021;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q6 {
public static void main(String[] args) {
	
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
	
	ll.add(10);
	ll.add(14);
	ll.add(15);
	ll.add(100);
	
	ListIterator<Integer> litr= ll.listIterator(ll.size());
	
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	
	
	
}
}
