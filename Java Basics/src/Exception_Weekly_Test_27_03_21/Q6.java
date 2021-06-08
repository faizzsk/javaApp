package Exception_Weekly_Test_27_03_21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * 
 * 
 * Sr. No.	Key	throw	throws
1	Definition	Throw is a keyword which is used to throw an exception explicitly in the program inside a function or inside a block of code.	
Throws is a keyword used in the method signature used to declare an exception which might get thrown by the function while executing the code.
2	Internal implementation	Internally throw is implemented as it is allowed to throw only single exception at a time i.e we cannot throw multiple exception with throw keyword.	
On other hand we can declare multiple exceptions with throws keyword that could get thrown by the function where throws keyword is used.
3	Type of exception	With throw keyword we can propagate only unchecked exception i.e checked exception cannot be propagated using throw.	
On other hand with throws keyword both checked and unchecked exceptions can be declared and for the propagation checked exception must use throws keyword followed by specific exception class name.
4	Syntax	Syntax wise throw keyword is followed by the instance variable.	
On other hand syntax wise throws keyword is followed by exception class names.
5	Declaration	In order to use throw keyword we should know that throw keyword is used within the method.	
On other hand throws keyword is used with the method signature.
 * 
 * 
 * 
 */
public class Q6 {

	public static void main(String[] args)throws FileNotFoundException {

		
		int a=34;
		int b =0;

		FileReader fr= new FileReader("ab.txt");

		try {
			
		if(b==0) {
			throw new ArithmeticException();
		}else
		{
			System.out.println(a/b);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
