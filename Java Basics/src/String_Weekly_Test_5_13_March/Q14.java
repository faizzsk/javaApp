package String_Weekly_Test_5_13_March;

public class Q14 {

	public static void main(String[] args) {

		
		String str="THE SKY IS THE LIMIT";
		char ch[]=str.toCharArray();
		
		String input="MIT";
		
		char ch2[]=input.toCharArray();
		int cnt=0;
		for(int i=0;i<ch2.length;i++)
		{		

			for(int j=0;j<ch.length;j++)
			{
				if(ch2[i]==ch[j])
				{
					cnt++;
					break;
				}
			}
			
		}
		
		if(cnt>=input.length())
		{
			System.out.println("yes");
		}
	
	}

}
