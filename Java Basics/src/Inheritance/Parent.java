package Inheritance;

public class Parent {

	int x,y;
	static int a = 420;
	
	
	public void m1()
	{
		System.out.println("Parent's M1 method");
	}
	
	
	public void m2()
	{
		System.out.println("Parents's M2 method");
	}
	
	public static void give()
	{
		System.out.println("Static Method of parent class");
	}
	
	
	public Parent()
	{
		System.out.println("Parent's Contructor");
	}
	
}
