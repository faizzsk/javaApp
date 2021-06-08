package Assignment3;


public class AccessModifier {
	public int rno=8;
	protected int adNo;
	 int age;
	private int cid;

	public void doPublic()
	{
		
	}
	
	void doDefault()
	{
		
	}
	
	protected void doProtected() {
		
	}
	
	
	private void doPrivate()
	{
		
	}
	
	public static void main(String[] args) {

			
		AccessModifier  ac = new AccessModifier();
		
	//	ac.rno;
		System.out.println(ac.rno);
		
		ac.doPrivate();
		
		
	}

}
