package Assignment_10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedException {

	public static void main(String[] args) throws FileNotFoundException {

		
		
		try {
			FileReader fin = new FileReader("abc.text");// this is checked exception

			int c= 8/0;// this is unchekd exception
		}catch(ArithmeticException a) {
			System.out.println(a);
			a.getStackTrace();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
