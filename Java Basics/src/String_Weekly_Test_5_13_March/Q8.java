package String_Weekly_Test_5_13_March;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {

		
		
		
		
		String[] str= {"I","Love","UK","county"};
	
		for(int i = 0 ; i <str.length-1;i++)
		{
			if(str[i].length() < str[i+1].length())
			{
				String temp = str[i];
				str[i]=str[i+1];
				str[i+1]=temp;
			}
		}
	System.out.println(Arrays.toString(str));
	
	}

}
