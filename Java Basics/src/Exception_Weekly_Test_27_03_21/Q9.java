package Exception_Weekly_Test_27_03_21;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
	
	public static void openFile() throws IOException,FileNotFoundException{
		FileReader fin = new FileReader("abc.txt");
		DataInputStream dataInputStream =  null;
        try
        {
            dataInputStream = new DataInputStream(new FileInputStream("abc.txt"));
            while(true)
            {
                dataInputStream.readInt();  
            }           
        }
        catch (EOFException eofException)
        {           
            eofException.printStackTrace();
        }
	
	}
	
	

	public static void main(String[] args) throws ClassNotFoundException {
		Class temp = Class.forName("fgdg") ;

		
		
		
		String s="faiz";
		
		Scanner sc = new Scanner(System.in);
	
	
	
	int k;
	try {
		int c = 23/0;
		k=sc.nextInt();
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
	}
	catch (InputMismatchException e) {
		// TODO: handle exception
	}
	
	
	
	
	}

}
