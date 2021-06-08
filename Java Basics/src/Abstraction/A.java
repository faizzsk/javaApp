package Abstraction;

public class A  {
	
	
	
	
	
	
	

	public A() {
		super();

		System.out.println("Parent Constructor ");
	}

	public void abstractMethod() {

		
		
		
		System.out.println("We must provide abstract method implementation in its sub class");
	}
	
	public void instanceMethod() {
		
		System.out.println("Override is possible for instance method");
		
	}
	
	public static void  staticMethod()
	{
		System.out.println("it is not overriding it is reimplemantation");
	}
	
	

	public static void main(String[] args) {

		A a = new A(); // refrence type and object is of same class here
		
		System.out.println(a.a);// we can access insitance variable of abstract class
		System.out.println(A.b+" "+A.c);//access static variable of abstract class
		
		a.instanceMethod();//oveeride now it will invoke A's instance method
		A.staticMethod();// it will call A's static method
		a.abstractMethod();
		
		
		
		//Demo d = new Demo();
		//it will give compile time error
		
		Demo d = new A(); // we can create object of A with Demo's refrence type
		
		System.out.println(d.a+" "+d.d);
		
		System.out.println(d.b+" "+d.c);
		
		d.abstractMethod();//it will see abstract is abstract method availble in Demo
		//then if it is availble ...it will take decison to run the child's abstract method
		//bcz we are creating child ka object
		
		
		d.staticMethod();// it will call parents means demo ka static method..bcz static method deal with complie time binding
		
		
		
		
		
	}

}
