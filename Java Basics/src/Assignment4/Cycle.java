package Assignment4;

public class Cycle {

		int accountNo;
		int numberofWheels;
		
		
		
		Cycle()
		{
			System.out.println("I am in Default consturctor");
			
		}
		
		Cycle(int accountNo , int numberofWheels)
		
		{
			this();
			
			System.out.println("I am in Another Consturctor");
			this.accountNo = accountNo;
			this.numberofWheels = numberofWheels;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle a = new Cycle();
		
		Cycle b = new Cycle(232, 2);
		
	}

}
// use of *this* keyword

// with a feild : to diffrentiate between instance variable and local variable
// with a constructor : to call another Constructor
//with method : invoke current class object method