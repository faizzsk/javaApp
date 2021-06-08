package Collection;

import java.util.Stack;

public class BracketEva {

	public static void main(String[] args) {

		
		String str ="[{10+5}]";
		char [] ch = str.toCharArray();
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0 ; i < ch.length ; i++)
		{
			if(ch[i]=='[' || ch[i]=='{')
			{
				stk.push(ch[i]);
			}
			if(ch[i]<='9' && ch[i]>='0')
			{
				
			}
		}
		
	}

}
