package String_Weekly_Test_5_13_March;

public class Q15 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Faiz");
		StringBuilder strb= new StringBuilder("Sneha");
		
		
		sb.append(strb);
		System.out.println(sb);
		
		sb.insert(2, "k");
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.reverse());
		
		
		
		
		
	}

}
