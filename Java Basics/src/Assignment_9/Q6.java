package Assignment_9;

public class Q6 {
	
	public static void main(String[] args) {
	
	
	String s = "FAIZ";
	
	for(int i = 0 ; i < s.length() ; i++)
	{
		char ch = s.charAt(i);
		
		if (ch >=65  && ch<=90)
        {
            ch = (char)( (ch + 32) ); 
        }
	
		System.out.print(ch);
	}
}
}
