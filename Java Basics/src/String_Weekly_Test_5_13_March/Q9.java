package String_Weekly_Test_5_13_March;

public class Q9 {

	public static void main(String[] args) {
		
		// {
		// {
		// {
		// }
		// }
		//{
		//}
		//{
		//{
		//}
		
		String s = "[{][] }[] {}[]";
		
		int bal=0;
		
		char ch[]=s.toCharArray();
		int a=0;
		int b=0;
		int c=0;
		
		for(int i = 0 ; i < ch.length ; i++)
		{
			if(ch[i]=='{' )
			{
				a++;
			}
			if(ch[i]=='[' )
			{
				b++;
			}
			if(ch[i]=='(')
			{
				c++;
			}
			if(ch[i]=='}')
			{
				a--;
			}
			if( ch[i]==']')
			{
				b--;
			}
			if(ch[i]==')')
			{
				c--;
			}
			if(a<0 || b<0||c<0 )
			{
				break;
			}
			
		}
		
		
		
		if (a<0 || b<0||c<0)
		{
			System.out.println("not valid");
		}else
		{
			System.out.println(" valid");
		}
	}

}
