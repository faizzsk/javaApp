package Assignment_10;

public class Q8 {
public static void main(String[] args) {
	
	
	int a=34;
	
	try {
		int c=a/0;//===>1(exception will occur)
		System.out.println("Line after Exception");
		System.out.println("----");
	}catch(Exception e) {
		System.out.println(e);//===>2
	}
	finally {
		System.out.println("Finally block");//====>3
	}
	System.out.println("after catch");//===>4
}
}
