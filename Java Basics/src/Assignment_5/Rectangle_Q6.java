package Assignment_5;

public class Rectangle_Q6 {

	
	int length , breadth;
	
	
	public Rectangle_Q6(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void area()
	{
		System.out.println("Area :"+(length * breadth));
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter :"+(2*(length * breadth)));
	}
}
