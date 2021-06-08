package Assignment_10;

import java.util.Scanner;

class InvalidPassword extends Exception{
	
		public InvalidPassword() {
		
		System.out.println("Password must not contain digit");
		
		}
	
	
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String passWord;
		Scanner sc = new Scanner(System.in);
		
		try {
			passWord = sc.next();
			
			char[]ch=passWord.toCharArray();
			int flag=0;
			for(int i = 0 ; i < ch.length ; i++) {
				if(ch[i]>='a' && ch[i]<='z') {
					flag=0;

				}else {
					flag=1;
					break;
				}
				
			}
			
			if(flag==0) {
				System.out.println("sucesss");
			}else {
				
					throw new InvalidPassword();

			}}
			catch(InvalidPassword ip) {
				
				System.out.println(ip);
			}
			
		
		
	
		
		
		
		
		
		

	}
}

