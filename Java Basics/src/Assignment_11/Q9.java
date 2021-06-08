package Assignment_11;

public class Q9 {

	public static void main(String[] args) {

		//Integer i = new Integer(45);
		String s = "34";
		
		int i = Integer.parseInt(s);
		
		int j = Integer.valueOf(s);
		
		System.out.println(i+"----"+j);
		
		
		String k = "34";
		
		float f = Float.parseFloat(k);
		float f1 = Float.valueOf(f);
		System.out.println(f+"--------"+f1);
		
		double d = Double.parseDouble(k);
		double d1=Double.valueOf(d);
		System.out.println(d+"-------"+d1);
		
	}

}
