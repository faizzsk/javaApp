package Assignment_9;

public class Q4 {

	public static void main(String[] args) {
int o=0;
		
		String s = "let everything happen to you";
		char cr = 0;
		int cnt=0;
		for(int i = 0 ; i < s.length();i++)
		{		

			char ch = s.charAt(1);
			char ch1 = s.charAt(i);
			
			if(ch == ch1)
			{
				cnt++;
				
			}
		
			if(cnt==2)
			{
				//System.out.println(i);
				o=i;
				cr=ch;
			//	o=cnt;
				break;
			}
		}
		
		System.out.println(cr+" "+o);
		
		
		
		
		
		
		
		
	}

}
