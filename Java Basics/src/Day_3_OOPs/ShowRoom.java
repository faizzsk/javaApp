package Day_3_OOPs;

import java.util.Scanner;

public class ShowRoom {
	
	String name;
	long mobno;
	double cost;
	double dis=0;
	//double newCost=0;
	
	public ShowRoom() {
		
			name = "";
			mobno = 0;
			cost = 0;
			dis = 0;
	}
	
	void input()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println(" Enter Name , Mobile Number ,Cost");
		name = sc.next();
		mobno = sc.nextLong();
		cost = sc.nextDouble();
		
	}
	
	void calculate()
	{System.out.println("in cal");
		if  (cost <= 10000)
		{
			 
			 dis = cost - (cost * 0.05);
		}else if(cost > 10000 && cost <=20000)
		{
			dis = cost - (cost * 0.1);
		}else if (cost > 20000 &&  cost <= 35000)
		{
			dis = dis+cost - (cost * 0.15);
		}else if (cost > 35000)
		{
			dis = cost - (cost * 0.20);
		}else
		{
			dis =dis+ cost;
		}
	}
	
	void display()
	{
		System.out.println("-------");
		System.out.println("Customer Name :"+name);
		System.out.println("Mobile Number :"+mobno);
		System.out.println("Amount to be Paid after Discount :"+dis);
	}
	
	
	

	public static void main(String[] args) {

		ShowRoom a = new ShowRoom();
		
		a.input();
		a.calculate();
		a.display();
		
		
		
		
	}

}
