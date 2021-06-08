package Assignment3;

public class Account {
	int acNo;
	String Name;
	double bal;
	private int amt;

		
		public void insert(int acn , String nm, double b) {
			
		
			this.acNo = acn;
			this.Name = nm;
			this.bal = b;
			
			
		}
		
		public void display() {

			
			
			System.out.println(acNo);
			System.out.println(Name);
			System.out.println(bal);
		}
		
		public void deposite(int amt)
		{
			this.amt = amt;
			bal = bal + amt;
		}

		public void withdrwa(int amt)
		{
			this.amt = amt;
			bal  = bal - amt;
		}
		public void check_bal()
		{
			System.out.println(bal);
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account();
		a.insert(12, "Faiz", 100);
		a.deposite(500);
		a.withdrwa(500);
		a.check_bal();
		a.display();
		
		
		
	}

}
//Q6