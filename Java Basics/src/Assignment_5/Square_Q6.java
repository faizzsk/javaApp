package Assignment_5;

public class Square_Q6 extends Rectangle_Q6 {

	public Square_Q6(int length, int breadth) {
		super(length, breadth);
		
	}

	
	
	public void area()
	{
		System.out.println("Area :"+(length * length));
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter :"+(4*(length)));
	}
	
}
