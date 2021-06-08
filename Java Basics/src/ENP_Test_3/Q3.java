package ENP_Test_3;


 class st{
	
	static {
		System.out.print(2);
	}
	
}

public class Q3 {

	
	static int i;
	
	static {
		System.out.println(1);
		i = 100;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(3);
		System.out.println(Q3.i);
		
	}

}
