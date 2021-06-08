package Assignment_6;
class Base { 
	 public final void show() { 
	 System.out.println("Base::show() called"); 
	 } 
	} 
	class Derived extends Base { 
	 public void show() { 
	 System.out.println("Derived::show() called"); 
	 } 
	
	 public static void main(String[] args) { 
	 Base b = new Derived();; 
	 b.show(); 
	 
	} 
}
	/// Can not oveerriden final method
	
	//Q1 Q5