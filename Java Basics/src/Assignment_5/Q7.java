package Assignment_5;

class X{
	public X()
	
	{
		System.out.println(1);
	}
}

class Y extends X{
	public Y()//Implicit super constructor X() is undefined. Must explicitly invoke another constructor
	{
		System.out.println(2);
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
