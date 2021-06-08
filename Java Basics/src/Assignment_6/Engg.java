package Assignment_6;
public class Engg extends Employee 
{ 
	public Engg(String name, int id) 
	{
		super(name, id);
	}

	public static void main(String[] args)
	{ 
		// Creating an object of the subclass of abstract class. 
		Engg e = new Engg("Nikita", 1); 
		e.m1(); 
	} 
}

