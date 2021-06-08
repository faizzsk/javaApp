package Assignment_10;

import java.io.IOException;

// Throw : is used to throw new exception
// throws : Throws is a keyword used in the method signature used to declare an exception which might get thrown by the function while executing the code.
public class Q2 {

	public static void main(String[] args) throws IOException{

		int a=10;
		int b=0;
		try {
		if(b==0) {
			throw new ArithmeticException();// by thow we can explicitly throw exception
		}
		else {
			int c = a/b;
			System.out.println(c);
		}}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}

}
