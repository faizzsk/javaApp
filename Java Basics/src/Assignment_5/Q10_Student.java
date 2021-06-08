package Assignment_5;

public class Q10_Student {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Q10_Student s = new Q10_Student();
		Q10_Student s1=new Q10_Student();
		Q10_Student s3 = s1;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3.toString());
		
		
		
		
	}

	@Override
	public String toString() {
		return "Q10_Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
