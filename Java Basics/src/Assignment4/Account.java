package Assignment4;

public class Account {
	
	
	long acNo;
	String customerName;
	
	

public Account() {
		System.out.println("I am in Default Constructor");
		acNo =12242535343L;
		customerName="Shital";
	}

	


	public Account(long acNo, String customerName) {

		System.out.println("I am in parametrized consturctor");
		this.acNo = acNo;
		this.customerName = customerName;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Account a = new Account();
		//System.out.println(a.acNo+" "+a.customerName);
		
		//Account b = new Account();
		//System.out.println(b.acNo+" "+b.customerName);
	
		Account c = new Account(464646646, "Faizz"); 
		System.out.println(c.acNo+" "+c.customerName);
		
		
		
		Account d = new Account();
		d.acNo=23535;
		d.customerName="Sneha";
		System.out.println(d.acNo+" "+d.customerName);

		Account e = new Account();
		e.acNo=2323;
		e.customerName="Mohit";
		
		System.out.println(e.acNo+" "+e.customerName);

		
	}
	
	

}
