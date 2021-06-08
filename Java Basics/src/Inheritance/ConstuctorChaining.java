package Inheritance;

public class ConstuctorChaining {

	
	int a,b,c,d;
	
	
	public ConstuctorChaining() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ConstuctorChaining(int a) {
		
		this.a = a;
	}



	public ConstuctorChaining(int a, int b) {
		this(a);
		this.b = b;
	}



	public ConstuctorChaining(int a, int b, int c) {
		this(a,b);
		this.c = c;
	}



	public ConstuctorChaining(int a, int b, int c, int d) {
		this(a,b,c);
		this.d = d;
	}



	public static void main(String[] args) {

		ConstuctorChaining c = new ConstuctorChaining(4, 2, 4, 2);
	}

}
