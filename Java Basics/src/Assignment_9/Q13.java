package Assignment_9;

public class Q13 {

	private static void main(String[] args) {

		String s= "Faiz Iqbal Shaikh";
	//	String s1="";
		String name="";
		String s1[] = s.split(" ");
		String s2=s1[s1.length-1];
		for(int i = 0 ; i < s1.length-1;i++)
		{
			char ch = s1[i].charAt(0);
			
			name = name+ch+".";
			
		}
		System.out.println(name+""+s2);
		
		
		
		
		
		
		
		
		
		
		
		//for(int i = 0 ; i < s.length() ; i++)
	//	{
		//	char ch = s.charAt(i);
			
			
		//}
		
		//System.out.println(s1);
		
	}

}
