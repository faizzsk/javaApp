package Exception_Weekly_Test_27_03_21;

import java.io.IOException;

public class Q3 {

	
	public void c() throws IOException
	{
	throw new IOException("io");	
	}
	
	public void b() throws IOException
	{
		c();
	}
	public void a() throws IOException
	{
		try {
		b();}
		catch (Exception e) {
System.out.println("exception");		}
	}
	
	
	
	///in checked exceptions  and it can be propagated
	// by throws keyword ONLY
	
	
	public static void main(String[] args) {

		
		Q3 q = new Q3();
		
		try {
		q.a();	
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("---");
		
		
		
		
		
		
		
	}

}
