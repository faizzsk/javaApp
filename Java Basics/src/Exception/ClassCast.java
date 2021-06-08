package Exception;


class Parent{
	
	public Parent() {
		System.out.println("Parent Constructor");
	}
	
}

class Child extends Parent{
	public Child() {
	
		System.out.println("Child Constructor");
	}
}
public class ClassCast {

	public static void main(String[] args) throws ClassCastException {

		Parent p = new Parent();
		Parent p1 = new Child();
		
		try 
		{
			Child c = (Child) new Parent();
		}
		
	catch (Exception e) {
			System.out.println(e);
		}
	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * The java.lang.ClassCastException is one of the unchecked exception in Java. 
 * It can occur in our program when we tried to convert an object of one class type 
 * into an object of another class type.

When will be ClassCastException is thrown
When we try to cast an object of Parent class to its Child class type, 
this exception will be thrown.
When we try to cast an object of one class into another class type that has not extended the other class or they don't have any relationship between them.
 */
