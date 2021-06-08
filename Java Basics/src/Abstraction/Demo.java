package Abstraction;

abstract public class Demo {

	// a is insrance variable
	int a=40; // private - protected - default - public is allowed
	static int b;
	static final int c=40;
	final int d = 44;
	
	
	
	public Demo() {
		
		System.out.println("In Constructor of emo Abstract classs");
	
	// abstract class have consturcotr 
	// why ?
	/*
	 * The main purpose of the constructor is to initialize the newly created object. 
	 * In abstract class, we have an instance variable, abstract methods, 
	 * and non-abstract methods. 
	 * We need to initialize the non-abstract methods and instance variables, 
	 * therefore abstract classes have a constructor. 
     * we can access this construcor or invoke this construcotr with its child classs
     * 
	 */
	}
	
	
	public void instanceMethod()//allowed bcz abstract classs is not fully abstract
	{
		System.out.println("In instance method of demo");
	}
	
	public abstract void abstractMethod();
	
//	public static abstract void staticMEthod();
	
	public static void staticMethod()//allowed bcz static method has nothin to do with objects it gets executed with class name
	{
		System.out.println("In static Method of demo abstract");
	}
	
	
	//public static abstract  void uff();//u can not have static abstract class
	//why?
	//first thing is we can not ovveride static method
	//No, we cannot override static methods because method overriding is based on dynamic binding 
	//at runtime and the static methods are bonded using static binding at compile time. 
	//So, we cannot override static methods.

	//The calling of method depends upon the type of object that calls the static method. It means:

	//If we call a static method by using the parent class object, the original static method will be called from the parent class.
	//If we call a static method by using the child class object, the static method of the child class will be called.

	// now if we create abstract static method we have to call it through it is own class name
	//but now we dont have body of it so it is of no use
	
	
}


/*



Assuming we make a static method abstract. Then that method will be written as:

public abstract static void func();

Scenario 1: When a method is described as abstract by using the abstract type modifier, 
it becomes responsibility of the subclass to implement it because they have no specified 
implementation in the super-class. Thus, a subclass must override them to provide method 
definition.

Scenario 2: Now when a method is described as static, it makes it clear that 
this static method cannot be overridden by any subclass 
(It makes the static method hidden) as static members are compile-time elements 
and overriding them will make it runtime elements (Runtime Polymorphism).

Now considering Scenario 1, if the func method is described as abstract, 
it must have a definition in the subclass. But according to Scenario 2, 
the static func method cannot be overridden in any subclass and 
hence it cannot have a definition then. So the scenarios seem to contradict each other. 
Hence our assumption for static func method to be abstract fails. 
Therfore, a static method cannot be abstract.







*/