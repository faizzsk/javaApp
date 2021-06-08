package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1 ; i <=10 ;i++)
		{
			arr.add(i);
		}
		
		
		Iterator<Integer> itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

//		while(itr.hasNext())
//		{
//			if(itr.next() % 2 ==0) {
//				itr.remove();
//			}
//		}
//	//	System.out.println(itr.next());
		
	
		
		//ListIterator
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Faizz");
		str.add("Rifa");
		str.add("Rahul");
		str.add("Fatima");
		
		int i =1;
		ListIterator<String> list = str.listIterator();
			System.out.println(list.nextIndex());

//		while(i <= str.size())
//		{
//			
//			System.out.println(list.next());
//			int index1 = list.nextIndex();
//	        System.out.println("Position of Next Element: " + index1);
//
//			i++;
//		}
		
		//	ListIterator<String> list = str.listIterator();
			

			while(list.hasNext())
			{
				
				System.out.println(list.next());
			//	System.out.println(list.previousIndex());
				
				
			}

			
		while(list.hasPrevious())
		{
			
			System.out.println(list.previous());
			System.out.println(list.previousIndex());
			
			
		}

		while(list.hasPrevious())
		{
			
			System.out.println(list.previous());
			System.out.println(list.previousIndex());
			
			
		}
	}

}
