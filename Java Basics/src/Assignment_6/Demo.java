package Assignment_6;
final class DemoChild extends Demo
{
	//public void dispaly() {
		//can not br oevverriden
//	}
}
public class Demo {
	
	final int x=0;
	
	public final void dispaly()
	{
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		//d.x = 10;=> cant change final method
		
	}
}
