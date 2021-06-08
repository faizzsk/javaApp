package Assignment_5;


class A
{
	String s = "Class A";
}

class B extends A{
	String s = "Class B";
	
	public B()
	{
		System.out.println(super.s);
	}
}

class C extends B
{
	String s = "Class C";
	
	public C()
	{
		System.out.println(super.s);
	}
}

public class Q11_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		C c = new C();
		System.out.println(c.s);
		
		// class B
		// class A
		// class C
	}

}
