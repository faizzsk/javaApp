package String_Weekly_Test_5_13_March;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		
		String s;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur name");
		s= sc.next();
		char ch[]= s.toCharArray();
		int index=0;
		for(int i = ch.length-1 ; i>=0;i--)
		{			

			System.out.print(ch[i]);
			ch[index]=ch[i];
			index++;
		}
		
		
		System.out.println(Arrays.toString(ch));
		
		
	}

}
