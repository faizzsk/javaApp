package Exception_Weekly_Test_27_03_21;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

class Parent{
	public void Greet() 
	{
		
	}
	
	public void greet() throws FileNotFoundException{
		
	}
	
	public void g()throws IOException// throws Exception
	{
		
	}
}



public class Q10 extends Parent {
	
	public void Greet() throws InputMismatchException // unched is allowed
	{
		
	}
	
	public void greet() throws Exception{
		
	}
	
	public void g()
	{
		
	}

	public static void main(String[] args) {

	}

	
}
/*

If SuperClass does not declare an exception, then the SubClass can only declare unchecked exceptions, but not the checked exceptions.
If SuperClass declares an exception, then the SubClass can only declare the child exceptions of the exception declared by the SuperClass, but not any other exception.
If SuperClass declares an exception, then the SubClass can declare without exception.





*/