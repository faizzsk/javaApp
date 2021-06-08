package Day_3_OOPs;

public class A {

	
			int a;
			static int b = 10;
			
			
			void m1()
			{
				System.out.println();
				System.out.println("M1 :"+a);
				System.out.println("B :"+b);
				m2();
				System.out.println("---M1 ends here");
			}
			
			void m2()
			{
				System.out.println("in m2");
				m3();
				System.out.println("M2 ends here");
			}
			
			static void m3()
			{
				System.out.println("in m3");
				System.out.println("M3 :"+b);
				m4();
				System.out.println("M3 ends here");
			}
			
			static void m4()
			{
				System.out.println("IN M4");
				A obj = new A();
				obj.m2();
				System.out.println("m4 ends here");
			}
	
	
	
	
	
	public static void main(String[] args) {

			A obj = new A();
			
		//	obj.m1();
		
			obj.m3();
		
		
		
	}

}

// you can access static variable and method in non static (instance) method
// you can not directly access instance method from static method
// if you want to call instance method from static method you need an object
// u can access inc