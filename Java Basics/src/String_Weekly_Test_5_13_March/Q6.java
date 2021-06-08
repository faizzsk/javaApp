package String_Weekly_Test_5_13_March;

public class Q6 {

	public static void main(String[] args) {

		
		
		String s = "hi how are you students";
		
		String[] str = s.split(" ");
		
		
		String first= str[0];
		String last=str[str.length-1];
		
		String join = first + last;
		String neww = " ";
//		for(int i=str.length-2; i>=1;i--)
//		{
//			char ch = str[i].charAt(i);
//			
//			System.out.print(ch);
//		}
//		System.out.println();
		for(int i=1; i<=str.length-2;i++)
		{
			char ch[]=str[i].toCharArray();
		
			for(int j = ch.length-1 ; j >=0;j--)
			{
				
				
				neww = neww+ch[j];
	
			}
			neww = neww+" ";
		}
		//System.out.println(neww);
		
		String ans = first  + neww + last;
		System.out.println(ans);
		
		
	}

}
