package HW19_2_2020;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Delevery boy Name and Mobile Number");
		DeleveryBoy d = new DeleveryBoy(sc.next(), sc.nextLong());
		
		System.out.println("Enter Item ID , Item Name , Item Price");
		Item i = new Item(sc.nextInt(), sc.next(), sc.nextDouble());
		
		System.out.println("Enter Order ID , Date ");
		Order o = new Order(sc.nextInt(), sc.next(), i, d);
		
		
		
		System.out.println("----Bill Details-------");
		//System.out.println("Order ");
		
		o.display();
		
		
		
		
		
		
		
		
		
	}

}
