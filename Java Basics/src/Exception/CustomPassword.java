package Exception;

import java.util.Scanner;
//create an array of 5 book
// book has author
//find out how many books are wriiten by kanetkar;
//
class PasswordExc extends Exception{
	
	public PasswordExc(String s) {
		System.out.println(s);
	}
	
}


public class CustomPassword {

	public static void main(String[] args) {

		
		String passWord;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Password");
		int flag=0;
		try {
			
			
				passWord  = sc.next();
			
				char ch[]=passWord.toCharArray();
			
				for(int i = 0 ; i < ch.length ; i++) 
				{
				
						if(ch[i]=='a' && ch[i]=='g' && ch[i]=='z') 
						{
								flag=0;
						}else 
						{
								flag=1;
								break;
						}
				
				}
			
				
				if(passWord.length()<6) 
				{
					throw new PasswordExc("Password Length is less than 6");
				}
				
				if(flag==1) 
				{
					throw new PasswordExc("Invalid Password");
				}
				else 
				{
					System.out.println("Valid");
				}
			
			
		}catch (PasswordExc e) 
		{

			System.out.println(e);
			
		}
		
		
		
		
		
	}

}
