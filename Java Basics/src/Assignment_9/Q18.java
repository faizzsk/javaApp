package Assignment_9;

import java.util.Arrays;

public class Q18 {

	public static void main(String[] args) {

		
		String str ="andddddd then qeqa rrrr";
	//	int cnt=0;
		int max=0;
		char o = 0;
		String srt []= str.split(" ");
		System.out.println(Arrays.toString(srt));
		for(int i = 0 ; i <str.length();i++)
		{
			int cnt=0;
			char ch = str.charAt(i);
			
			for(int j =i;j<str.length();j++)
			{
				if(ch== str.charAt(j))
				{
					cnt++;
				}
			}
		
//			if(cnt >0)
//			{
//				System.out.println(cnt+" "+ch);
//			}
//			
			if(max<cnt)
			{
				max=cnt;
				o=ch;
			}
		
		}
			
		System.out.println("Max: "+max+"  "+o);
		
		
	}

}
