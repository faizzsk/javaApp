



interface Faizz{
	
	public default void  defaultMethod()
	{
		System.out.println("In interface's Default Method");
	}
	
	public static void staticMethod() {
		System.out.println("In Interface's Static method");
	}
	
	public  int a=90;
	//by deffault every variable inside the interface is static and final
	
	
	void instanceMethod(); // default modifier can work, public can , private and protected is not
	
}


public class InterfaceDEmo implements Faizz {

	int a;
	
	public void instanceMethod()
	{
		System.out.println("BOdy of instance method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceDEmo id = new InterfaceDEmo();
		System.out.println(id.a);
		Faizz f = new InterfaceDEmo(); // you can not create object of interface,but you can create object of the class which implements interface by its reference variable
		//f.a=144; it is not allowed bcz it will check a in interface 
		System.out.println(f.a);
		
		//System.out.println(Faizz.k);
		f.defaultMethod();
		Faizz.staticMethod();
		
	}

}
