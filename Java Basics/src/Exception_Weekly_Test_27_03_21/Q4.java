package Exception_Weekly_Test_27_03_21;
abstract class ierror{
	public abstract void k(); 
}

class demo{
	static int a;
	static {
		a=65/0;
	}
	//int a=45;
//	public void p() {
//		System.out.println("--");
//	}
}
public class Q4 extends ierror {

	public static void main(String[] args) {
		
		//Class c = Class.forName("dfgh");
		//ierror i = new ierror();
		//i.k();
		System.out.println(demo.a);//Exception in thread "main" java.lang.ExceptionInInitializerError

		
//		int a[] = new int[10000*1000000000];//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

		System.out.println();
		
		demo d = new demo();
	//	System.out.println(d.a);
		
//	while(true) {
//			System.out.println("Hi" +(1000068064*240002424));
//			System.out.println(1000000000*500000000);
//		}
		
	}

	@Override
	public void k() {
		// TODO Auto-generated method stub
		
	}

}
