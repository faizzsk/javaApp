package Assignment_11;

public class Q6 {
/* 
 * 
 * The automatic conversion of primitive 
 * data types into its equivalent Wrapper type 
 * is known as boxing and opposite operation is known as unboxing.
 */
	public static void main(String[] args) {

		int a = 89;
		
		Integer i = new Integer(a);//Boxing
		System.out.println("Boxing :"+i);
		
		Integer i1 = new Integer(55);
		
		int b = i1; //unboxing
		System.out.println("Unboxing :"+b);
		
		
		
		
		
		
		
		
	}

}
