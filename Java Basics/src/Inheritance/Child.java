package Inheritance;

public class Child extends Parent {
	
	 static int a=50;

	public Child()
	{
		System.out.println("Child's constuctor");
	}
	public void m1()
	{
		System.out.println("In Child's M1 method");
	}
	
	
	public static void give()
	{
		System.out.println("Static method of Child class");
	}
	public static void main(String[] args) {
		
		Parent p = new Parent(); // only parent class constuctor gets called
		p.m1();
		p.m2();
		p.give();// static parent
	//	p.a=70;
		System.out.println(p.a);//parents static variable gets called
		
		
		Parent p1 = new Child();// first parent then child constuctor gets called(with the help of super ()
		p1.m1();// in the writing phase it will check the method in parent's class
		//if it is availble there it wont give us error
		//but if there is no M1 method in parent's class,it will give us error on compile time
		//and if child class override the method you will get child's m1 method.
		//if we comments out M1 method we will get error
		p1.m2();
		p1.give();//static parent
		System.out.println(p1.a);//static variable gets called
		
		
		
		Child c = new Child();//first parent then child consturctor
		c.m1();//it will call child M1
		c.m2();//it will call parent M2
		c.give();//static child
		System.out.println(c.a);// instance variable gets called
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
 * 
 * 
 * 
 * The following are some important points for method overriding and static methods in Java. 
1) For class (or static) methods, the method according to the type of reference is called, not according to the object being referred, which means method call is decided at compile time.
2) For instance (or non-static) methods, the method is called according to the type of object being referred, not according to the type of reference, which means method calls is decided at run time.
3) An instance method cannot override a static method, and a static method cannot hide an instance method. For example, the following program has two compiler errors. 
 
 * 
*/