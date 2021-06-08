package Assignment_6;

public class Y implements X{
	
	public void methodX() {

		
		System.out.println("Y Class");
	}


	public static void main(String[] args) {

		
		Y y = new Y();
		X x = new Y();
		x.methodX();
		y.methodX();
		
	}

	

}
// Q 7