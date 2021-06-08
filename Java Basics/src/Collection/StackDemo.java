package Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		
		Stack<String> stk = new Stack<String>();
		
		stk.push("Faizz");
		stk.push("Mohit");
		stk.push("Shital");
		//stk.push("Sneha");
		//stk.push("Nikita");
		
		System.out.println(stk.search("Sneha"));
		System.out.println("Peek :"+stk.peek());
		while(!stk.isEmpty())
		{
			System.out.println(stk.pop());
		}
		
		System.out.println("Capacity :"+stk.capacity());
		System.out.println("Size : "+stk.size());
	}

}
