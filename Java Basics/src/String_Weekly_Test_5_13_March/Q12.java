package String_Weekly_Test_5_13_March;

public class Q12 {

	public static void main(String[] args) {

		
		String [] s = {"Dhyaneshwar","Nikita","kajal","Mohit","faiz"};
		String output="";
		
		int cnt=0;
		for(int i = 0 ; i < s.length;i++)
		{
			
			if(cnt >= s[i].length())
			{
				output = output+ "#";
			}
			else
			{	
				char ch = s[i].charAt(cnt);

				output = output+ch;
				
			}
			cnt++;

		}
		
		System.out.println(output);
		
	}

}
